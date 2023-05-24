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

public class IdentifierTest {

  @ParameterizedTest
  @MethodSource("provideIdentifier")
  void calculateIdentifierCompletenessTest(Identifier identifier, int percentage) {

    assertEquals(percentage, identifier.calculateIdentifierCompleteness());
  }

  private static Stream<Arguments> provideIdentifier() {

    List<Identifier> IdentifierList = new ArrayList<Identifier>();

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
            IdentifierList.add(identifier);

        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return Stream.of(
        Arguments.of(IdentifierList.get(0), 0),
        Arguments.of(IdentifierList.get(3), 100),
        Arguments.of(IdentifierList.get(4), 0)
    );

}

  
}
