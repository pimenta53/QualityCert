grammar Rec;
options {
  output=AST;
  ASTLabelType=Tree;
  tokenVocab=RecTokens;
  k=2;
}

@header {
  package parser;
}
@lexer::header {
  package parser;
}
prog 		: exp  	-> ^(Prog exp)
			;
exp			: e1=expOR e2=expORPr 	-> ^(Exp $e1 $e2)
			;
expOR		: e1=expAND e2=expANDPr 	-> ^(ExpOR $e1 $e2)
			;
expAND		: aritExp relExp 	-> ^(ExpAND aritExp relExp)
			;
expORPr		: '|' exp       	-> ^(ExpORPr exp)
			| 					-> ^(ExpORPrEmpty)
			;
expANDPr	: '&' exp			-> ^(ExpANDPr exp)
			|					-> ^(ExpANDPrEmpty)
			;
aritExp		: term termPr 		-> ^(AritExp term termPr)
			;
relExp		: '<' aritExp		-> ^(RelExpLess aritExp)
			| '>' aritExp		-> ^(RelExpMore aritExp)
			| '<>' aritExp		-> ^(RelExpDiferent aritExp)
			| '<=' aritExp		-> ^(RelExpLessEqual aritExp)
			| '>=' aritExp		-> ^(RelExpMoreEqual aritExp)
			| 						-> ^(RelExpEmpty)
			;
term		: factor factorPr -> ^(Term factor factorPr)
			;
termPr		: '+' term termPr	-> ^(TermPrPlus term termPr)
			| '-' term termPr	-> ^(TermPrNeg term termPr)
			| '=' term termPr	-> ^(TermPrEqual term termPr)
			| 					-> ^(TermPrEmpty)
			;
factorPr	: '*' factor factorPr 	-> ^(Times factor factorPr)
			| '/' factor factorPr 	-> ^(Div factor factorPr)
			| 						-> ^(FactorPrEmpty)
			;
factor		: 'nil'												-> ^(FNil)
			| INT												-> ^(FInteger INT)
			| STRING											-> ^(FString STRING)
			| '(' expList ')'									-> ^(FExpList expList)
			| '-' exp											-> ^(FNeg exp)
			| 'while' e1=exp 'do' e2=exp						-> ^(FWhile $e1 $e2)
			| 'for' ID ':=' e1=exp 'to' e2=exp 'do' e3=exp		-> ^(FFor ID $e1 $e2 $e3)
			| 'break'											-> ^(FBreak)
			| 'let' decList 'in' expList 'end'					-> ^(FLet decList expList)
			| lv=lValue											-> ^(FLvalue $lv)
			| ('if' e1=exp 'then' e2=exp ('else' e3=exp)?		-> {e3==null}? ^(FIfThen $e1 $e2)
																-> ^(FIfThenElse $e1 $e2 $e3))
			;
decList		: dec* 				-> ^(DecList dec*)
			;
dec			: tyDec				-> ^(DTyDec tyDec)
			| varDec			-> ^(DVarDec varDec)
			| funDec			-> ^(DFunDec funDec)
			;
tyDec		: 'type' typeId '=' ty	-> ^(TyDec typeId ty)
			;
ty 			: '{' fieldList '}'		-> ^(TFieldList fieldList)
			| 'array of' ti=typeId		-> ^(TArrayOf $ti)
			| ti=typeId				-> ^(TTypeId $ti)
			;
fieldList	: ID ':' ti=typeId auxFieldList	-> ^(FieldListDP ID $ti auxFieldList)
			| ID '=' ti=typeId auxFieldList	-> ^(FieldListEqual ID $ti auxFieldList)
			| 								-> ^(FieldListEmpty)
			;
auxFieldList: (intFieldList)*	-> ^(AuxFieldList intFieldList*)
			;
intFieldList
			: ',' ID aux1						-> ^(IntFieldList1 ID aux1)
			| ('[' e1=exp ']' ('of' e2=exp)?	-> {e2==null}? ^(IntFieldList2 $e1)
												-> ^(IntFieldList3 $e1 $e2))
			;
aux1		: ':' ti=typeId		-> ^(Aux11 $ti)
			| '=' ti=typeId		-> ^(Aux12 $ti)
			;
typeId		: ID				-> ^(TypeId ID)
			| STRING			-> ^(TypeIdString STRING)
			| INT				-> ^(TypeIdInteger INT)
			| 'nil'				-> ^(TypeIdNil)
			;
varDec		: ('var' ID (':' ti=typeId)? aux2 	-> {ti==null}? ^(VarDec1 ID aux2)
										   	 	-> ^(VarDec2 ID $ti aux2))
			;
aux2		: ':=' exp   	-> ^(Aux21 exp)
			| '=' exp	   	-> ^(Aux22 exp)
			;
funDec		: 'function' ID '(' fieldList ')' (':' ti=typeId)? '=' exp	-> {ti==null}? ^(FunDec1 ID fieldList exp)
																	   	-> ^(FunDec2 ID fieldList $ti exp)
			;
lValue		: ID fra=functionRecordArray	-> ^(LValue ID $fra)
			;

functionRecordArray
			: '(' argList ')'			-> ^(FRAArgList argList)
			| '{' fieldList '}'			-> ^(FRAFieldList fieldList)
			| ((a1=auxFRA1)? (a2=auxFRA2)?	-> {a1!=null && a2==null}? ^(FRA1 $a1)
											-> {a1==null && a2!=null}? ^(FRA2 $a2)
											-> {a1!=null && a2!=null}? ^(FRA3 $a1 $a2)
											-> ^(FunctionRecordArrayEmpty))
			;
auxFRA1		: '[' exp ']'		-> ^(AuxFRA1 exp)
			;
auxFRA2		: 'of' exp							-> ^(AuxFRA21 exp)
			| (a3=aux3 (a4=aux4)? ':=' e2=exp	-> {a4==null}? ^(AuxFRA22 $a3 $e2)
												-> ^(AuxFRA23 $a3 $a4 $e2))
			| a4=aux4	':=' e2=exp				-> ^(AuxFRA24 $a4 $e2)
			;
aux3		: ('.' ID)*			-> ^(Aux3 ID*)
			;
aux4		: ('[' exp ']')*	-> ^(Aux4 exp*)
			;
expList		: exp auxExpList	-> ^(ExpList exp auxExpList)
			| 					-> ^(ExpListEmpty)
			;
auxExpList  : (';' exp)*		-> ^(AuxExpList exp*)
			;
argList		: exp auxArgList	-> ^(ArgList exp auxArgList)
			|						-> ^(ArgListEmpty)
			;
auxArgList	: (',' exp)* 	-> ^(AuxArgList exp*)
			;

ID			: (LETTER (LETTER|DIGIT|'_')*|'_main') ;
INT			: DIGIT+ ;
STRING		: '"'~('"')*'"' ;
fragment DIGIT
			: '0'..'9' ;
fragment LETTER
			: ('a'..'z'|'A'..'Z') ;
NESTED_ML_COMMENT
    :   '/*'
        (options {greedy=false;} : (NESTED_ML_COMMENT | .))*
        '*/' {$channel = HIDDEN;}
    ;
WHITESPACE 	: ('\t'|' '|'\r'|'\n' |'\u000C')+
	{
		$channel = HIDDEN;
	};