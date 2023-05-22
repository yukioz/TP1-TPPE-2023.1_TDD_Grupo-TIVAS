package entities;

public class PessoaFisica {
    // Atributos
    private Nome nome;
    private String cpf;
    private String matricula;
    private String sexo;
    private String email;

    // Construtor
    public PessoaFisica(Nome nome, String cpf, String matricula, String sexo, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.sexo = sexo;
        this.email = email;
    }

    // Getters e Setters

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para verificar a completude da PessoaFisica

}

