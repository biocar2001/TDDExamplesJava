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
    public static final String DELETE_WHITE_SPACES = "Carlos esta in hte house";
    public static final String STRING_NO_VOWEL = "TV";
    public static final String STRING_PALINDROMO = "reconocer";
    public static final String PYRAMIDAL = "         1 \n" +
            "        2 2 \n" +
            "       3 3 3 \n" +
            "      4 4 4 4 \n" +
            "     5 5 5 5 5 \n" +
            "    6 6 6 6 6 6 \n" +
            "   7 7 7 7 7 7 7 \n" +
            "  8 8 8 8 8 8 8 8 \n" +
            " 9 9 9 9 9 9 9 9 9 \n" +
            "10 10 10 10 10 10 10 10 10 10 ";
    public static final String STRING_JAVA_FORMATTING_INPUT = "java 100\n" +
            "cpp 65\n" +
            "python 50";
    public static final String STRING_JAVA_FORMATTING_OUTPUT = "================================\n" +
            "java           100 \n" +
            "cpp            065 \n" +
            "python         050 \n" +
            "================================";
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
     * Test for isPalindrome Method
     */
    public void check_if_string_is_palindrome(){
        Assertions.assertFalse(UtilsStrings.isPalindrome(STRING_NO_VOWEL));
        Assertions.assertTrue(UtilsStrings.isPalindrome(STRING_PALINDROMO));
    }

    @Test
    /**
     * Test for deleteWhiteSpace Method
     */
    public void delete_white_space_is_correct(){

        Assertions.assertEquals(UtilsStrings.remoWhiteSpaces(DELETE_WHITE_SPACES),"Carlosestainhtehouse");
        UtilsStrings.printPattern1(10);
    }

    @Test
    /**
     * Test for pyramide construction Test
     */
    public void pyramide_is_built(){
        //TODO make Unit test for this method
        UtilsStrings.printPattern1(10);
    }

    @Test
    /**
     * Test for javaOutputFormatting Method
     */
    public void check_if_formatting_java_is_correct(){
        Assertions.assertEquals(
                UtilsStrings.javaOutputFormatting(STRING_JAVA_FORMATTING_INPUT),STRING_JAVA_FORMATTING_OUTPUT
        );

    }
}
