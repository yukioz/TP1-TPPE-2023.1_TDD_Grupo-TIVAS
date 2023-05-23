package entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class IdentifierTest {
  Identifier identifier1 = new Identifier("123", "233"); 

  @Test
    public void calculateIdentifierCompletenessTest() {
      int completness = identifier1.calculateIdentifierCompleteness();
      Assertions.assertEquals(completness, 100);
    }

}
