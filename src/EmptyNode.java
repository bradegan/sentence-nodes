/**
 * Creates an empty node to be used in a sentence.
 */

public class EmptyNode implements Sentence {
  String empty;
  Sentence rest;


  public EmptyNode() {
    this.empty = "";
    this.rest = rest;
  }

  @Override
  public int getNumberOfWords() {
    return 0;
  }

  @Override
  public String longestWord() {
    return "";
  }

  @Override
  public String toStringHelp(String acc) {
    int acclength = acc.length();
    if (acc.charAt(acclength - 1) == '.') {
      return acc;
    }
    return acc + ".";
  }

  @Override
  public String toString() {
    return "";
  }

  @Override
  public Sentence clone() {
    return new EmptyNode();
  }

  @Override
  public Sentence merge(Sentence other) {
    return other;
  }

  @Override
  public int counterHelper(int counter) {
    return counter;
  }
}
