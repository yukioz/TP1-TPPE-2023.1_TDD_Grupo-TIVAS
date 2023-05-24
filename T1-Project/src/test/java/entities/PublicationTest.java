package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicationTest {

    Identifier identifier = new Identifier("12345678910", "");
    Author author = new Author(identifier, "brazilian", "Brazil", "Brasilia", "DF");
    Publication publication = new Publication("title", "2020", "portuguese", author);

    @Test
    void calculateCompleteness() {
        assertEquals(100, publication.calculatePublicationCompleteness());
    }
}
