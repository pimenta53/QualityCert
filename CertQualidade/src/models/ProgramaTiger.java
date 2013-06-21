package models;

public class ProgramaTiger {

  private long id = 0;
  private String nome = "";
  private String descricao = "";
  private String data = "";
  private String nomeFicheiro = "";
  private int avaliacao = 0;
  private String utilizador = "";
  private long caracP = 0;

  public long getId() {return id;}

  public void setId(long id) {this.id = id;}

  public String getNome() {return nome;}

  public void setNome(String nome) {this.nome = nome;}

  public String getDescricao() {return descricao;}

  public void setDescricao(String descricao) {this.descricao = descricao;}

  public String getData() {return data;}

  public void setData(String data) {this.data = data;}

  public String getNomeFicheiro() {return nomeFicheiro;}

  public void setNomeFicheiro(String nomeFicheiro) {this.nomeFicheiro = nomeFicheiro;}

  public int getAvaliacao() {return avaliacao;}

  public void setAvaliacao(int avaliacao) {this.avaliacao = avaliacao;}

  public String getUtilizador() {return utilizador;}

  public void setUtilizador(String utilizador) {this.utilizador = utilizador;}

  public long getCaracP() {return caracP;}

  public void setCaracP(long caracP) {this.caracP = caracP;}

}
