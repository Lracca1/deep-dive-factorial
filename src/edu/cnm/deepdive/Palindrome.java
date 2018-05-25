package edu.cnm.deepdive;

public class Palindrome {

  public static boolean isPalindrome(String input) {
    input = input.toLowerCase();
    input = input.replaceAll("[^a-z0-9]", "");
    return isRecursivePalindrome(input);
  }

  private static boolean isRecursivePalindrome(String input) {
    return (
        (input.length() <= 1)
        || (
            (input.charAt(0) == input.charAt(input.length() - 1))
          && isRecursivePalindrome(input.substring(1, input.length() - 1))
        )
    );


  }

}