package entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class IdentifierTest {
  Identifier identifier1 = new Identifier("123", ""); 
  Identifier identifier2 = new Identifier("", "");

  @Test
    public void calculateIdentifierCompletenessTest() {
      int completness = identifier1.calculateIdentifierCompleteness();
      Assertions.assertEquals(completness, 100);
    }

  @Test
    public void calculateIdentifierCompletenessTest2() {
      int completness = identifier2.calculateIdentifierCompleteness();
      Assertions.assertEquals(completness, 0);
    }   
}
