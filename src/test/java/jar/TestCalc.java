package jar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestCalc 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCalc( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalc.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {
      Calc c = new Calc();
      
      assertEquals(c.add(1,2), 3);
    }
    
    public void testSubtract()
    {
      Calc c = new Calc();
      
      assertEquals(c.subtract(5,1), 4);
    }
}
