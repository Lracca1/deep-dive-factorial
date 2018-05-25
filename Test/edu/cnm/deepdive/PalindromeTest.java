package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static edu.cnm.deepdive.Palindrome.isPalindrome;

class PalindromeTest {

private static final String[] PALINDROMES = {
    "Madam, I'm Adam!",
    "A man, a plan, a canal - Panama!",
    "A Toyota's a Toyota",
    "Radar"
};

private static final String[] NON_PALINDROMES = {
    "A man, a plan, a canal - Panamo!",
    "Abacab",
    "sonar"
};

  @Test
  void testInterestingPalindromes() {
    for (String test : PALINDROMES) {
      assertTrue(isPalindrome(test));
    }
    for (String test : NON_PALINDROMES) {
      assertFalse(isPalindrome(test));
    }
  }

  @Test
  void testDegeneratePalindromes() {
    assertTrue(isPalindrome(""), "Empty string is by definition a palindrome");
    assertTrue(isPalindrome("A"), "Single-character string is by definition a palindrome");
  }
}