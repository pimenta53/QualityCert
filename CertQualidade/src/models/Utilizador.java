package models;

public class Utilizador {

  private long id = 0;
  private String username = "";
  private String password = "";
  private String email = "";
  private long grupo = 0;

  public long getGrupo() {return grupo;}

  public void setGrupo(long grupo) {this.grupo = grupo;}

  public String getEmail() {return email;}

  public void setEmail(String email) {this.email = email;}

  public String getPassword() {return password;}

  public void setPassword(String password) {this.password = password;}

  public String getUsername() {return username;}

  public void setUsername(String username) {this.username = username;}

  public long getId() {return id;}

  public void setId(long id) {this.id = id;}
}
