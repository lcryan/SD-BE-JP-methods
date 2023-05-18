package nl.novi.jp.methods.junior;


/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 * <p>
 * Hoe maak je hoofdletters van een String in Java?
 **/

public class JuniorFive {
    public void main(String[] args) {

        rockbandsInUpperCase("Muse");
        rockbandsInUpperCase("System of a Down");
        rockbandsInUpperCase("Nirvana");
        rockbandsInUpperCase("Pearl Jam");
    }

    public static void rockbandsInUpperCase(String bandName) {
        System.out.println(bandName.toUpperCase());
    }
}