package entities;

public class NomeCompleto {
    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;

    public NomeCompleto(String primeiroNome, String nomeMeio, String ultimoNome) {
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
    public int calculaCompletudeNome() {
        int completude = 0;

        if(primeiroNome != null && !primeiroNome.isEmpty()) {
            completude+=34;
        }
        if(nomeMeio != null && !nomeMeio.isEmpty()) {
            completude+=33;
        }
        if(ultimoNome != null && !ultimoNome.isEmpty()) {
            completude+=33;
        }

        return completude;
    }
}
