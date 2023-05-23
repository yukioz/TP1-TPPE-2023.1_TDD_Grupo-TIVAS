package entities;

public class Identifier {
  private String lattes;
  private String orcid;

  public Identifier(String lattes, String orcid) {
    this.lattes = lattes;
    this.orcid = orcid;
  }

  public String getLattes() {
    return lattes;
  }

  public void setLattes(String lattes) {
    this.lattes = lattes;
  }

  public String getOrcid() {
    return orcid;
  }

  public void setOrcid(String orcid) {
    this.orcid = orcid;
  }


  public int calculateIdentifierCompleteness() {
    int completness = 100;

    return completness;
}
}
