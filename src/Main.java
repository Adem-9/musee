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
        Salle salle1 = new Salle(1, "Salle principale", 120.5);

        Oeuvre oeuvre1 = new Oeuvre(
                "La Joconde", 1503, 77.0, 53.0
        );

        Musee musee1 = new Musee("Musee des Beaux-Arts", adresse1);
        musee1.ajouterSalle(salle1);

        System.out.println(salle1);
        System.out.println(oeuvre1);
        System.out.println(musee1);
    }
}