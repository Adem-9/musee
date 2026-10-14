
public class Salle {

    private int etage;
    private String nom;
    private double superficie;

    // Constructeur
    public Salle(int etage, String nom, double superficie) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
    }

    // Getters
    public int getEtage() {
        return this.etage;
    }

    public String getNom() {
        return this.nom;
    }

    public double getSuperficie() {
        return this.superficie;
    }

    // Affichage
    @Override
    public String toString() {
        return "Salle{" +
                "etage=" + etage +
                ", nom='" + nom + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
