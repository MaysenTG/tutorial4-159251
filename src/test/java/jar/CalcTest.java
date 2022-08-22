package jar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalcTest {

    @Test
    void addTest()
    {
      Calc c = new Calc();
      
      assertEquals(c.add(1,2), 3);
    }
    
    @Test
    void subtractTest()
    {
      Calc c = new Calc();
      
      assertEquals(c.subtract(5,1), 4);
    }
}
