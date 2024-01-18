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
        return "\tContact {" +
                "\n\t\tnom='" + nom + '\'' +
                ",\n\t\tprenom='" + prenom + '\'' +
                ",\n\t\tnumeroTelephone='" + numeroTelephone + '\'' +
                ",\n\t\tadresseEmail='" + adresseEmail + '\'' +
                ",\n\t\tadressePhysique='" + adressePhysique + '\'' +
                ",\n\t\tautresInformations='" + autresInformations + '\'' +
                "\n\t\t}\n";
    }
}
