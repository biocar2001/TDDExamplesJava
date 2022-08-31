package strings;

/**
 * Class for practice with Strings
 */
public class StringProgram {
    /**
     * Main method if you want use this class like a program by console
     * @param args
     * @throws Exception
     */
    public static void main (String ... args) throws Exception {
        System.out.println(reverse(args[0]));
    }

    /**
     * Method for reversing the content of a String
     * @param rev
     * @return String reversed
     * @throws Exception
     */
    public static String reverse(String rev) throws Exception {
        StringBuilder finalReverse = new StringBuilder();
        try{
            if (rev == null) {
                throw new IllegalArgumentException("String must have a value");
            }

            for (int i = rev.toCharArray().length - 1; i >= 0; i--) {
                finalReverse.append(rev.toCharArray()[i]);
            }
            System.out.println(finalReverse.toString());
            return finalReverse.toString();

        }catch (Exception n){
             throw new Exception();
        }

    }

    /**
     * Check if String given contains vowel letter or not
     * @param stringReverse
     * @return true if contains vowel or false if it doesn´t contains vowels
     */
    public static boolean vowelInString(String stringReverse) {
        return stringReverse.toLowerCase().matches(".*[aeiou].*") ? true: false;
    }
}
