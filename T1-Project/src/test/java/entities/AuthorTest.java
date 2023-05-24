package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class AuthorTest {
    Identifier identifier1 = new Identifier("123", "123"); 
    Author author1 = new Author(identifier1, "brazilian", "brazil", "saoPaulo", "saoPaulo"); 

    @Test
    void calculateAuthorCompleteness() {
        int completness = author1.calculateAuthorCompleteness();
        Assertions.assertEquals(completness, 100);
    }
}