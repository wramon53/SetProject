import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class DeckTester extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testOneCard() {
    Deck d = new Deck("OneCard.dat");
    assertTrue(d.hasNext());
    assertEquals("1ROO", d.getNext().toString());
  }
  
  public void testIsSet(){
    Deck d = new Deck("CardSet.dat");
    assertTrue(d.hasNext());
    assertEquals
  }
  
  public void testNoSet(){
  }
  
}