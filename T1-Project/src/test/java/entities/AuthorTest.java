package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class AuthorTest {
    Identifier identifier1 = new Identifier("123", "123"); 
    Author author1 = new Author(identifier1, "brazilian", "brazil", "saoPaulo", "saoPaulo"); 

    @Test
    void calculateAuthorCompleteness1() {
        int completness = author1.calculateAuthorCompleteness();
        Assertions.assertEquals(completness, 100);
    }

    Identifier identifier2 = new Identifier("", ""); 
    Author author2 = new Author(identifier2, "potuguese", "portugal", "lisbon", "seixal"); 

    @Test
    void calculateAuthorCompleteness2() {
        int completness = author2.calculateAuthorCompleteness();
        Assertions.assertEquals(completness, 100);
    }

    Identifier identifier3 = new Identifier("123", "123"); 
    Author author3 = new Author(identifier3, "", "", "", ""); 

    @Test
    void calculateAuthorCompleteness3() {
        int completness = author3.calculateAuthorCompleteness();
        Assertions.assertEquals(completness, 100);
    }

    Identifier identifier4 = new Identifier("", ""); 
    Author author4 = new Author(identifier4, "", "", "", ""); 

    @Test
    void calculateAuthorCompleteness4() {
        int completness = author4.calculateAuthorCompleteness();
        Assertions.assertEquals(completness, 0);
    }
}