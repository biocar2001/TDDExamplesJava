package strings.utils;

import java.util.ArrayList;

public class UtilsStrings {
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

    /**
     * Method for telling you if a string is palyndrome
     * @param stringPalindromo
     * @return true or false
     */
    public static boolean isPalindrome(String stringPalindromo) {
        try{
            StringBuilder alreves = new StringBuilder();
            char[] arrayPalindromo = stringPalindromo.toCharArray();
            for(int i = arrayPalindromo.length -1 ; i >= 0; i --){
                alreves.append(arrayPalindromo[i]);
            }
            return alreves.toString().equals(stringPalindromo) ? true : false;

        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
