package nl.novi.jp.methods.junior;

/**
 * Uitdagende opdracht!
 * Een stuk van de code is uitgecommentarieerd, omdat deze pas gaat werken, wanneer de methode doTransaction afgemaakt
 * is.
 * Maak doTransaction af. Deze moet twee waardes accepteren (welk datatype?). Een waarde is het banksaldo voor de
 * transactie, de andere waarde is de waarde van de transactie.
 * Wanneer de waarde van de transactie negatief is, gaat het om het opnemen (withdraw) van geld. Deze methode dient dan
 * ook aangeroepen te worden. Wanneer deze positief is, gaat het om geld storten (deposit). Dan dient de deposit methode
 * aangeroepen te worden.
 */

public class JuniorFour {
    public static void main(String[] args) {
        doTransaction(1000, -200);
        doTransaction(123, 3445);
    }

    public static void doTransaction(int balanceBeforeTransaction, int valueTransaction) {
        if (valueTransaction < 0) {
            withdraw(balanceBeforeTransaction, valueTransaction);
        } else {
            deposit(balanceBeforeTransaction, valueTransaction);
        }
    }

    public static void deposit(int bankAccountBalance, int amount) {
        int updatedBalance = bankAccountBalance + amount;

        System.out.println("The user deposits: " + amount + " euro.");
        System.out.println("The new balance is: " + updatedBalance);
    }

    public static void withdraw(int bankAccountBalance, int amount) {

        int updatedBalance = bankAccountBalance + amount;

        System.out.println("The user withdraws " + amount + " euro."); // the amount here has to be a negative number//
        System.out.println("The new balance is: " + updatedBalance);
    }

}
