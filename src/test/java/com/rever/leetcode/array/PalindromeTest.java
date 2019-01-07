package com.rever.leetcode.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    public void isPalindrome_should_return_false_when_given_number_is_less_than_0() {
        assertThat(palindrome.isPalindrome(-1), is(false));
    }

    @Test
    public void isPalindrome_should_return_true_when_given_number_is_0() {
        assertThat(palindrome.isPalindrome(0), is(true));
    }

    @Test
    public void isPalindrome_should_return_true_when_given_number_is_121() {
        assertThat(palindrome.isPalindrome(121), is(true));
    }

    @Test
    public void isPalindrome_should_return_false_when_given_number_is_122() {
        assertThat(palindrome.isPalindrome(122), is(false));
    }


}