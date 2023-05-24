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
        Assertions.assertEquals(completness, 50);
    }

    Identifier identifier2 = new Identifier("123", ""); 
    Author author2 = new Author(identifier2, "potuguese", "portugal", "lisbon", "seixal"); 

    @Test
    void calculateAuthorCompleteness2() {
        int completness = author2.calculateAuthorCompleteness();
        Assertions.assertEquals(completness, 100);
    }
}