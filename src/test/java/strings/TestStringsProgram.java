package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for testing the main class of String program where we ca find different methods for playing with strings
 */
public class TestStringsProgram {
    public static final String STRING_REVERSE = "Carlos";
    public static final String STRING_VOWEL = "Carlos";
    public static final String STRING_NO_VOWEL = "TV";
    @Test
    /**
     * Test for method reverse in StringProgram
     */
    public void reverse_string() throws Exception {
        Assertions.assertNotEquals(StringProgram.reverse(STRING_REVERSE),"");
        Assertions.assertEquals(StringProgram.reverse(STRING_REVERSE),"solraC");

    }

    @Test
    /**
    */
    public void check_vowel_in_string(){
        Assertions.assertTrue(StringProgram.vowelInString(STRING_VOWEL));
        Assertions.assertFalse(StringProgram.vowelInString(STRING_NO_VOWEL));
    }

}
