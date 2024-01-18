import java.time.LocalDate;

public class Contact {
    private String nom;
    private String prenom;
    private String numeroTelephone;
    private String adresseEmail;
    private String adressePhysique;
    private String autresInformations;

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }
    public String getAdresseEmail() {
        return adresseEmail;
    }
    public String getAdressePhysique() {
        return adressePhysique;
    }
    public String getAutresInformations() {
        return autresInformations;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }
    public void setAdressePhysique(String adressePhysique) {
        this.adressePhysique = adressePhysique;
    }
    public void setAutresInformations(String autresInformations) {
        this.autresInformations = autresInformations;
    }

    @Override
    public String toString() {
        return "\t\tContact{" +
                "\n\t\t\tnom='" + nom + '\'' +
                ",\n\t\t\tprenom='" + prenom + '\'' +
                ",\n\t\t\tnumeroTelephone='" + numeroTelephone + '\'' +
                ",\n\t\t\tadresseEmail='" + adresseEmail + '\'' +
                ",\n\t\t\tadressePhysique='" + adressePhysique + '\'' +
                ",\n\t\t\tautresInformations='" + autresInformations + '\'' +
                "\n\t\t}\n";
    }
}
