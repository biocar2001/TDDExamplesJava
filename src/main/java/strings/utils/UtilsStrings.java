package strings.utils;

import java.util.Scanner;

public class UtilsStrings {
    /**
     * Method for reversing the content of a String
     *
     * @param rev
     * @return String reversed
     * @throws Exception
     */
    public static String reverse(String rev) throws Exception {
        StringBuilder finalReverse = new StringBuilder();
        try {
            if (rev == null) {
                throw new IllegalArgumentException("String must have a value");
            }

            for (int i = rev.toCharArray().length - 1; i >= 0; i--) {
                finalReverse.append(rev.toCharArray()[i]);
            }
            System.out.println(finalReverse.toString());
            return finalReverse.toString();

        } catch (Exception n) {
            throw new Exception();
        }

    }

    /**
     * Check if String given contains vowel letter or not
     *
     * @param stringReverse
     * @return true if contains vowel or false if it doesn´t contains vowels
     */
    public static boolean vowelInString(String stringReverse) {
        return stringReverse.toLowerCase().matches(".*[aeiou].*") ? true : false;
    }

    /**
     * Method for telling you if a string is palyndrome
     *
     * @param stringPalindromo
     * @return true or false
     */
    public static boolean isPalindrome(String stringPalindromo) {
        try {
            StringBuilder alreves = new StringBuilder();
            char[] arrayPalindromo = stringPalindromo.toCharArray();
            for (int i = arrayPalindromo.length - 1; i >= 0; i--) {
                alreves.append(arrayPalindromo[i]);
            }
            return alreves.toString().equals(stringPalindromo) ? true : false;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Delete white spaces of string
     *
     * @param deleteWhiteSpaces
     * @return
     */
    public static String remoWhiteSpaces(String deleteWhiteSpaces) {
        if (!deleteWhiteSpaces.equals("")) {
            char[] arraySpaces = deleteWhiteSpaces.toCharArray();
            StringBuilder finalString = new StringBuilder();
            for (char caracter : arraySpaces) {
                if (!String.valueOf(caracter).equals(" ")) {
                    finalString.append(caracter);
                }

            }
            System.out.println("End Value" + finalString.toString());
            return finalString.toString();
        } else {
            return "Nothing for delete";
        }
    }

    /**
     * print Pattern pyramide
     *
     * @param rows
     */
    public static void printPattern1(int rows) {
        StringBuilder returnFinal = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);
            //print numbers
            printString(i + " ", i);

            //move to next line
            System.out.println("");
        }
    }

    /**
     * Print the pyramyde
     *
     * @param s
     * @param times
     */
    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }

    public static String javaOutputFormatting(String formattingField) {

        StringBuilder finalString = new StringBuilder();
        finalString.append("================================").append("\n");
        String[] twoValues = formattingField.split("\n");
        for (String v: twoValues) {
            String[] twoValuesv = v.split(" ");
            String lineS = twoValuesv[0];
            int lineI = Integer.parseInt(twoValuesv[1]);
            finalString.append(lineS);
            for (int i = lineS.length(); i < 15; i++) {
                finalString.append(" ");
            }
            System.out.println("End Value String " + finalString.toString());
            if (lineI < 100 && lineI > 9) {
                finalString.append("0").append(lineI).append(" ");
            } else if (lineI < 10) {
                finalString.append("00").append(lineI).append(" ");
            } else {
                finalString.append(lineI).append(" ");
            }
            finalString.append("\n");
        }


        finalString.append("================================");
        System.out.println("End All String " + finalString.toString());
        return finalString.toString();

    }

}
