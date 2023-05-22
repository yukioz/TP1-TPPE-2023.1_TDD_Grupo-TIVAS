package entities;

import java.util.ArrayList;

public class Publication {
    // Atributos
    private String title;
    private String publicationDate;
    private String language;
    private ArrayList<Author> authors;

    // Construtor
    public Publication(String title, String publicationDate, String language, ArrayList<Author> authors) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.language = language;
        this.authors = authors;
    }

    // Getters e Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    // Método para verificar a completude da PessoaFisica
    public int calculateCompleteness() {
        int completude = 100;

        return completude;
    }

    public int calculateAtomicCompleteness() {
        int completude = 100;

        return completude;
    }
}
