package nl.novi.jp.methods.junior;

/**
 * Deze klasse bevat al de methode negativeNumberChecker. Beantwoord voor jezelf wat deze methode doet.
 * // this method checks on if a number is negative or not
 * Roep de methode een paar keer aan om zijn gedrag in de praktijk te zien.
 */

public class JuniorThree {
    public static void main(String[] args) {
negativeNumberChecker(-100);
    }

    public static void negativeNumberChecker(int number) {
        if(number > 0) {
            System.out.println(number + " is een positief getal.");
        } else {
            System.out.println(number + " is een negatief getal.");
        }
    }
}
