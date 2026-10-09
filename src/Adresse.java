public class Adresse {

    private final  int numero;
    private final String rue;
    private final String codePostal;
    private final String ville;

    public Adresse (int numero, String rue, String codePostal, String ville ){

        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
// getteurs
    public int getNumero(){
        return this.numero;
    }

    public String getRue() {
        return rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
