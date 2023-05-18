package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode waarin je een string kunt stoppen. Deze methode transformeert de String op zo'n manier dat
 * alleen de eerste letter een hoofdletter is.
 * <p>
 * De methode wordt echter nog niet gebruikt voor printName(), waardoor de namen nu allemaal rare hoofdletters hebben.
 * <p>
 * Los dit op!
 * <p>
 * e hoeft alleen maar aanpassingen door te voeren in de printName methode.
 * * Voeg het resultaat van firstLetterToUpperCase toe aan een zelfgemaakte variabele. Vervang de input parameters met de variabele in de System.out.println
 * * Zowel de voor- als achternaam moet netjes gemaakt worden. De methode moet dus twee keer aangeroepen worden. Dus ook twee variabelen, wanneer je bovenstaande tip gebruikt!
 */
public class MediorThree {

    public static void main(String[] args) {
        printName("SjAaK", "Patat");
        printName("henk", "spaghetti");
        printName("Doerak", "BELL");
        printName("kURT", "cOBaIN");
    }

    public static void printName(String firstName, String lastName) {
        String firstNameInForm = firstLetterToUpperCase(firstName);
        String lastNameInForm = firstLetterToUpperCase(lastName);

        System.out.println("My first name is " + firstNameInForm + ". " + "My last name is " + lastNameInForm + ". ");
    }

    public static String firstLetterToUpperCase(String name) {

        String transformedName = name.toLowerCase();
        transformedName = transformedName.substring(0, 1).toUpperCase() + transformedName.substring(1);

        return transformedName;
    }

}
