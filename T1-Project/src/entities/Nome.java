package entities;

public class Nome {
    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;

    public Nome(String primeiroNome, String nomeMeio, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.nomeMeio = nomeMeio;
        this.ultimoNome = ultimoNome;
    }

    // Getters e Setters

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    // Método para verificar a completude do Nome
}

