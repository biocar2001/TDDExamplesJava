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
    */
    public void check_vowel_in_string(){
        Assertions.assertTrue(UtilsStrings.vowelInString(STRING_VOWEL));
        Assertions.assertFalse(UtilsStrings.vowelInString(STRING_NO_VOWEL));
    }

}
