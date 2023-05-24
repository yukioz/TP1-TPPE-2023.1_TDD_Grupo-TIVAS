package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicationTest {

    Identifier identifier1 = new Identifier("12345678910", "");
    Author author1 = new Author(identifier1, "brazilian", "Brazil", "Brasilia", "DF");
    Publication publication1 = new Publication("title", "2020", "portuguese", author1);

    Identifier identifier2 = new Identifier("", "");
    Author author2 = new Author(identifier2, "brazilian", "", "", "");
    Publication publication2 = new Publication("title", "2020", "portuguese", author2);

    @Test
    void calculatePublicationCompletenessTest1() {
        assertEquals(100, publication1.calculatePublicationCompleteness());
    }

    @Test
    void calculatePublicationCompletenessTest2() {

        // System.out.println(publication2.calculatePublicationCompleteness());
        assertEquals(87, publication2.calculatePublicationCompleteness());
    }
}
