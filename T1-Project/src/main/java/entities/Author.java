package entities;

public class Author {
    private String identifier_lattes;
    private String identifier_orcid;
    private String nationality;
    private String birthCountry;
    private String birthCity;
    private String birthState;

    // Construtor
    public Author(String identifier_lattes, String identifier_orcid, String nationality, String birthCountry, String birthCity, String birthState) {
        this.identifier_lattes = identifier_lattes;
        this.identifier_orcid = identifier_orcid;
        this.nationality = nationality;
        this.birthCountry = birthCountry;
        this.birthCity = birthCity;
        this.birthState = birthState;
    }

    public String getIdentifier_lattes() {
        return identifier_lattes;
    }

    public void setIdentifier_lattes(String identifier_lattes) {
        this.identifier_lattes = identifier_lattes;
    }

    public String getIdentifier_orcid() {
        return identifier_orcid;
    }

    public void setIdentifier_orcid(String identifier_orcid) {
        this.identifier_orcid = identifier_orcid;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    // Método para verificar a completude
    public int calculateCompleteness() {
        int completude = 100;

        return completude;
    }

    public int calculateOrInclusiveCompleteness() {
        int completude = 100;

        return completude;
    }

    public int calculateOrExclusiveCompleteness() {
        int completude = 100;

        return completude;
    }
}
