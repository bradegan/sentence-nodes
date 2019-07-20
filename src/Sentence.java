/**
 * This interface contains all operations that all sentences should support.
 */


public interface Sentence {


  /**
   * Returns the number of words in a given sentence.
   *
   * @return number of words
   */

  int getNumberOfWords();

  /**
   * Returns the longest word in a given sentence.
   *
   * @return longest word
   */
  String longestWord();

  /**
   * Returns the string value of the linked list.
   *
   * @returns sentence string form
   */

  String toString();

  /**
   * Returns a clone of a given sentence with same words and punctuation.
   *
   * @return cloned sentence
   */

  Sentence clone();

  /**
   * Returns a sentenced that has been merged with another sentence, same punctuation.
   *
   * @return combined word
   */

  Sentence merge(Sentence other);

  /**
   * Returns an integer to help with traversing through linked lists.
   *
   * @param counter increments to create a count
   * @return int
   */

  int counterHelper(int counter);


  /**
   * Takes in the accumulator and iterates through the linked list.
   *
   * @param str the word in string format
   * @return the string version of a given sentence
   */

  String toStringHelp(String str);


}
