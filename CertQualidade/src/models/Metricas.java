package models;

public class Metricas {

  private float pesoComentarios = 0;
  private float pesoLinhas = 0;
  private float pesoFuncoes = 0;
  private float pesoErros = 0;
  private float pesoTempo = 0;
  private float pesoCCMcCabe = 0;
  private float pesoHalstead = 0;
  private String data = "";

  public Metricas() {}

  public float getPesoErros() {return pesoErros;}

  public void setPesoErros(float pesoErros) {this.pesoErros = pesoErros;}

  public float getPesoCCMcCabe() {return pesoCCMcCabe;}

  public void setPesoCCMcCabe(float pesoCCMcCabe) {this.pesoCCMcCabe = pesoCCMcCabe;}

  public float getPesoHalstead() {return pesoHalstead;}

  public void setPesoHalstead(float pesoHalstead) {this.pesoHalstead = pesoHalstead;}

  public float getPesoFuncoes() {return pesoFuncoes;}

  public void setPesoFuncoes(float pesoFuncoes) {this.pesoFuncoes = pesoFuncoes;}

  public float getPesoLinhas() {return pesoLinhas;}

  public void setPesoLinhas(float pesoLinhas) {this.pesoLinhas = pesoLinhas;}

  public float getPesoComentarios() {return pesoComentarios;}

  public void setPesoComentarios(float pesoComentarios) {this.pesoComentarios = pesoComentarios;}

  public float getPesoTempo() {return pesoTempo;}

  public void setPesoTempo(float tempo) {this.pesoTempo = tempo;}

  public String getData() {return data;}

  public void setData(String data) {this.data = data;}
}
