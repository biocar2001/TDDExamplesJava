package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import strings.utils.UtilsStrings;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for testing the main class of String program where we ca find different methods for playing with strings
 */
public class TestUtilsStrings {
    public static final String STRING_REVERSE = "Carlos";
    public static final String STRING_VOWEL = "Carlos";
    public static final String STRING_NO_VOWEL = "TV";
    public static final String STRING_PALINDROMO = "reconocer";
    @Test
    /**
     * Test for method reverse in StringProgram
     */
    public void reverse_string() throws Exception {
        Assertions.assertNotEquals(UtilsStrings.reverse(STRING_REVERSE),"");
        Assertions.assertEquals(UtilsStrings.reverse(STRING_REVERSE),"solraC");

    }

    @Test
    /**
     * Test for vowelString
    */
    public void check_vowel_in_string(){
        Assertions.assertTrue(UtilsStrings.vowelInString(STRING_VOWEL));
        Assertions.assertFalse(UtilsStrings.vowelInString(STRING_NO_VOWEL));
    }

    @Test
    /**
     * Test for isPalindrome Test
     */
    public void check_if_string_is_palindrome(){
        Assertions.assertTrue(UtilsStrings.isPalindrome(STRING_PALINDROMO));
    }

}
