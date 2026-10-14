
import java.util.ArrayList;

public class Musee {

    private String nom;
    private Adresse adresse;
    private ArrayList<Salle> salles;

    // Constructeur
    public Musee(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.salles = new ArrayList<Salle>();
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public Adresse getAdresse() {
        return new Adresse(
                adresse.getNumero(),
                adresse.getRue(),
                adresse.getCodePostal(),
                adresse.getVille()
        );
    }

    public ArrayList<Salle> getSalles() {
        return new ArrayList<Salle>(salles);
    }

    // Ajouter une salle
    public void ajouterSalle(Salle salle) {
        this.salles.add(salle);
    }

    // Affichage
    @Override
    public String toString() {
        return "Musee{" +
                "nom='" + nom + '\'' +
                ", adresse=" + adresse +
                ", salles=" + salles +
                '}';
    }
}
