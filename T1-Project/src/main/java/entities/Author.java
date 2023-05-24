package entities;

public class Author {
    private Identifier identifier;
    private String nationality;
    private String birthCountry;
    private String birthCity;
    private String birthState;

    // Construtor
    public Author(Identifier identifier, String nationality, String birthCountry, String birthCity, String birthState) {
        this.identifier = identifier;
        this.nationality = nationality;
        this.birthCountry = birthCountry;
        this.birthCity = birthCity;
        this.birthState = birthState;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
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

    // Método para verificar a completness
    public int calculateAuthorCompleteness() {
        int completeness = 0;

        if(identifier.calculateIdentifierCompleteness() == 100){
            completeness += 50;
        }

        if(!nationality.isEmpty() || !birthCountry.isEmpty() || !birthCity.isEmpty() || !birthState.isEmpty()){
            completeness += 50;
        }
        
        return completeness;
    }
}
