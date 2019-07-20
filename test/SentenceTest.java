

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SentenceTest {

  Sentence emptyNodeTest;
  Sentence wordNodeTest2;
  Sentence wordNodeTest;

  @Before
  public void setup() {


    emptyNodeTest = new EmptyNode();
    wordNodeTest = new WordNode("Hello", new WordNode("World",
            new PunctuationNode(",", new WordNode("Test",
                    new PunctuationNode(".", new EmptyNode())))));
    wordNodeTest2 = new WordNode("The", new WordNode("Ending", new EmptyNode()));

  }


  @Test
  public void getNumberOfWordsTest() {

    assertEquals(0, emptyNodeTest.getNumberOfWords());
    assertEquals(5, wordNodeTest.getNumberOfWords());

  }

  @Test
  public void longestWordTest() {
    assertEquals("World", wordNodeTest.longestWord());
    assertEquals("", emptyNodeTest.longestWord());
    assertEquals("Ending", wordNodeTest2.longestWord());
  }

  @Test
  public void toStingTest() {
    assertEquals("Hello World, Test.", wordNodeTest.toString());
    assertEquals("The Ending.", wordNodeTest2.toString());
    assertEquals("", emptyNodeTest.toString());
  }


  @Test
  public void cloneTest() {
    assertEquals(wordNodeTest.toString(), wordNodeTest.clone().toString());
    assertEquals(wordNodeTest2.toString(), wordNodeTest2.clone().toString());
    assertEquals(emptyNodeTest.toString(), emptyNodeTest.clone().toString());
  }

  @Test
  public void mergeTest() {
    Sentence test = new WordNode("This", new WordNode("assignment",
            new WordNode("was", new WordNode("confusing",
                    new PunctuationNode("!", new PunctuationNode("!",
                            new PunctuationNode("!", new EmptyNode())))))));
    assertEquals("Hello World, Test. The Ending.",
            (wordNodeTest.merge(wordNodeTest2).toString()));
    assertEquals("This assignment was confusing!!! The Ending.",
            test.merge(wordNodeTest2).toString());
  }
}


