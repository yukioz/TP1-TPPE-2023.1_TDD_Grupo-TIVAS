package entities;

import java.util.ArrayList;

public class Publication {
    // Atributos
    private String title;
    private String publicationDate;
    private String language;
    private Author author;

    // Construtor
    public Publication(String title, String publicationDate, String language, Author author) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.language = language;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // Método para verificar a completness da PessoaFisica
    public int calculatePublicationCompleteness() {
        int completness = 100;

        return completness;
    }
}
