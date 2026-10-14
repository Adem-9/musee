
public class Oeuvre {

    private String nom;
    private int annee;
    private double largeur;
    private double hauteur;

    // Constructeur
    public Oeuvre(String nom, int annee, double largeur, double hauteur) {
        this.nom = nom;
        this.annee = annee;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public int getAnnee() {
        return this.annee;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double getHauteur() {
        return this.hauteur;
    }

    // Affichage
    @Override
    public String toString() {
        return "Oeuvre{" +
                "nom='" + nom + '\'' +
                ", annee=" + annee +
                ", largeur=" + largeur +
                ", hauteur=" + hauteur +
                '}';
    }
}
