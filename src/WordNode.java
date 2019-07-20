

public class WordNode implements Sentence {

  private String word;
  private Sentence rest;

  /**
   * Creates a word node to be used in a sentence.
   *
   * @param word a given node
   * @param rest the rest of the linked list
   */

  public WordNode(String word, Sentence rest) {

    this.word = word;
    this.rest = rest;

  }

  @Override
  public int getNumberOfWords() {
    return counterHelper(0);
  }


  @Override
  public String longestWord() {
    String restlong = this.rest.longestWord();
    int restlength = restlong.length();
    int mylength = this.word.length();

    if (restlength < mylength) {
      return this.word;
    }
    return restlong;
  }


  public String toStringHelp(String acc) {

    return "" + this.rest.toStringHelp(acc + " " + this.word);
  }

  @Override
  public String toString() {
    return toStringHelp("").trim();
  }


  @Override
  public Sentence clone() {
    Sentence newWordNode = new WordNode(this.word, this.rest.clone());
    return newWordNode;
  }


  @Override
  public Sentence merge(Sentence other) {
    return new WordNode(this.word, rest.merge(other));
  }

  @Override
  public int counterHelper(int counter) {
    return this.rest.counterHelper(1 + counter);
  }
}


