package models;

public class ISO9126 {

  //Funcionalidade
  private int confianca = 0;
  private int adequacao = 0;
  //Segurança
  private int maturidade = 0;
  private int toleranciaFalhas = 0;
  //Usabilidade
  private int inteligibilidade = 0;
  private int apreensibilidade = 0;
  //Eficiencia
  private int utilizacaoRecursos = 0;
  //Manutenção
  private int analisabilidade = 0;
  //Portabilidade
  private int adaptabilidade = 0;
  
  public int getConfianca() {return confianca;}
  
  public void setConfianca(int confianca) {this.confianca = confianca;}
  
  public int getAdequacao() {return adequacao;}
 
  public void setAdequacao(int adequacao) {this.adequacao = adequacao;}
  
  public int getMaturidade() {return maturidade;}
  
  public void setMaturidade(int maturidade) {this.maturidade = maturidade;}
  
  public int getToleranciaFalhas() {return toleranciaFalhas;}
  
  public void setToleranciaFalhas(int toleranciaFalhas) {this.toleranciaFalhas = toleranciaFalhas;}
  
  public int getInteligibilidade() {return inteligibilidade;}
  
  public void setInteligibilidade(int inteligibilidade) {this.inteligibilidade = inteligibilidade;}
  
  public int getApreensibilidade() {return apreensibilidade;}
  
  public void setApreensibilidade(int apreensibilidade) {this.apreensibilidade = apreensibilidade;}
  
  public int getUtilizacaoRecursos() {return utilizacaoRecursos;}
  
  public void setUtilizacaoRecursos(int utilizacaoRecursos) {this.utilizacaoRecursos = utilizacaoRecursos;}
  
  public int getAnalisabilidade() {return analisabilidade;}
  
  public void setAnalisabilidade(int analisabilidade) {this.analisabilidade = analisabilidade;}
  
  public int getAdaptabilidade() {return adaptabilidade;}
  
  public void setAdaptabilidade(int adaptabilidade) {this.adaptabilidade = adaptabilidade;}
}
