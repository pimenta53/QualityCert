package models;

public class RepositorioBase {

  private long id = 0;
  private String nomeFicheiro = "";
  private String data = "";
  private long caracPrograma = 0;

  public long getId() {return id;}

  public void setId(long id) {this.id = id;}

  public String getNomeFicheiro() {return nomeFicheiro;}

  public void setNomeFicheiro(String nomeFicheiro) {this.nomeFicheiro = nomeFicheiro;}

  public String getData() {return data;}

  public void setData(String data) {this.data = data;}

  public long getCaracPrograma() {return caracPrograma;}

  public void setCaracPrograma(long caracPrograma) {this.caracPrograma = caracPrograma;}
  
}
