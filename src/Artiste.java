import java.time.LocalDate;

public class Artiste {
 //data
    private String nom;
    private String prenom;
    private String nationnalite;
    private LocalDate dateNaissance;

    public Artiste (String nom,String prenom, String nationnalite, LocalDate dateNaissance){

        this.nom = nom;
        this.prenom = prenom;
        this.nationnalite = nationnalite;
        this.dateNaissance = dateNaissance;
    }
//
    @Override
    public String toString() {
        return "Artiste{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationnalite='" + nationnalite + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
