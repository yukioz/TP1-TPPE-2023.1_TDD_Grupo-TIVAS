package entities;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class AuthorTest {
    @ParameterizedTest
  @MethodSource("provideAuthor")
  void calculateAuthorCompletenessTest(Author author, int percentage) {

    System.out.println(author.getIdentifier().calculateIdentifierCompleteness());

    assertEquals(percentage, author.calculateAuthorCompleteness());
  }

  private static Stream<Arguments> provideAuthor() {

    List<Author> AuthorList = new ArrayList<Author>();

    try (InputStream inputStream = new FileInputStream("src/database/extratoFioCruz.json")) {
        JSONTokener tokener = new JSONTokener(inputStream);
        JSONObject object = new JSONObject(tokener);
        JSONArray publications = object.getJSONArray("publication");

        for (int i = 0; i < publications.length(); i++) {
            JSONObject publicationObj = publications.getJSONObject(i);

            // Identifier
            String lattes = "";
            try {
                lattes = publicationObj.getJSONArray("authors").getJSONObject(0).getString("identifier_lattes");
            } catch (JSONException | NullPointerException e) {
                // Handle the exception (e.g., log an error, set a default value, etc.)
            }

            String orcid = "";
            try {
                orcid = publicationObj.getJSONArray("authors").getJSONObject(0).getString("identifier_orcid");
            } catch (JSONException | NullPointerException e) {
                // Handle the exception
            }

            Identifier identifier = new Identifier(lattes, orcid);

            // Author
            String nationality = "";
            try {
                nationality = publicationObj.getJSONArray("authors").getJSONObject(0).getString("nationality");
            } catch (JSONException | NullPointerException e) {
                // Handle the exception
            }

            String birthCountry = "";
            try {
                birthCountry = publicationObj.getJSONArray("authors").getJSONObject(0).getString("birthCountry");
            } catch (JSONException | NullPointerException e) {
                // Handle the exception
            }

            String birthCity = "";
            try {
                birthCity = publicationObj.getJSONArray("authors").getJSONObject(0).getString("birthCity");
            } catch (JSONException | NullPointerException e) {
                // Handle the exception
            }

            String birthState = "";
            try {
                birthState = publicationObj.getJSONArray("authors").getJSONObject(0).getString("birthState");
            } catch (JSONException | NullPointerException e) {
                // Handle the exception
            }

            Author author = new Author(identifier, nationality, birthCountry, birthCity, birthState);
            AuthorList.add(author);

        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return Stream.of(
        Arguments.of(AuthorList.get(0), 0),
        Arguments.of(AuthorList.get(3), 100),
        Arguments.of(AuthorList.get(4), 50)
    );

}
}