/**
 * Creates a punctuation node to be used in a sentence.
 */

public class PunctuationNode implements Sentence {

  private String punctuation;
  private Sentence rest;

  public PunctuationNode(String punctuation, Sentence rest) {
    this.punctuation = punctuation;
    this.rest = rest;
  }

  @Override
  public int getNumberOfWords() {
    return counterHelper(0);
  }


  @Override
  public String longestWord() {
    return String.valueOf(this.punctuation);
  }

  @Override
  public String toStringHelp(String acc) {
    return "" + this.rest.toStringHelp(acc + this.punctuation);
  }


  @Override
  public String toString() {
    return toStringHelp("").trim();

  }


  @Override
  public Sentence clone() {
    Sentence newPuncNode = new PunctuationNode(this.punctuation, this.rest.clone());
    return newPuncNode;
  }

  @Override
  public Sentence merge(Sentence other) {
    return new PunctuationNode(this.punctuation, rest.merge(other));
  }

  @Override
  public int counterHelper(int counter) {
    return this.rest.counterHelper(1 + counter);
  }
}
