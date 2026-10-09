import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Test de la classe Adresse
        Adresse adresse1 = new Adresse(
                12, "rue de Lyon", "69003", "Lyon"
        );
        Artiste artiste1 = new Artiste(
                "Tammaria", "adem","algerienne", LocalDate.of(2003,4,12)
        );

        // Afficher le numéro de l'adresse
        System.out.println("Adresse complète :");
        System.out.println(adresse1);
        System.out.println(artiste1);
    }
}