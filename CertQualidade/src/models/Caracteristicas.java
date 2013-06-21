package models;

public class Caracteristicas {

  private int nComentarios = 0;
  private int nLinhas = 0;
  private int nFuncoes = 0;
  private int nErros = 0;
  private int tempo = 0;
  private int nCCMcCabe = 0;
  private int nHalstead = 0;
  private long programaTiger = 0;

  public Caracteristicas() {}

  public int getnErros() {return nErros;}

  public void setnErros(int nErros) {this.nErros = nErros;}

  public int getnCCMcCabe() {return nCCMcCabe;}

  public void setnCCMcCabe(int nCCMcCabe) {this.nCCMcCabe = nCCMcCabe;}

  public int getnHalstead() {return nHalstead;}

  public void setnHalstead(int nHalstead) {this.nHalstead = nHalstead;}

  public int getnFuncoes() {return nFuncoes;}

  public void setnFuncoes(int nFuncoes) {this.nFuncoes = nFuncoes;}

  public int getnLinhas() {return nLinhas;}

  public void setnLinhas(int nLinhas) {this.nLinhas = nLinhas;}

  public int getnComentarios() {return nComentarios;}

  public void setnComentarios(int nComentarios) {this.nComentarios = nComentarios;}

  public int getTempo() {return tempo;}

  public void setTempo(int tempo) {this.tempo = tempo;}

  public long getProgramaTiger() {return programaTiger;}

  public void setProgramaTiger(long programaTiger) {this.programaTiger = programaTiger;}
}
