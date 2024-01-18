import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        CarnetContacts contacts = CarnetContacts.getInstance();
        contacts.addList(CsvReader.readCsvFile("src\\data\\test.csv"));

//        for (int i = 0; i < 2; i++) {
//            Contact contact = new Contact();
//            System.out.println("nom ?");
//            contact.setNom(scan.nextLine());
//            System.out.println("prenom ?");
//            contact.setPrenom(scan.nextLine());
//            System.out.println("numero tel ?");
//            contact.setNumeroTelephone(scan.nextLine());
//            System.out.println("adresse mail ?");
//            contact.setAdresseEmail(scan.nextLine());
//            System.out.println("adresse physique ?");
//            contact.setAdressePhysique(scan.nextLine());
//            System.out.println("autresInformations ?");
//            contact.setAutresInformations(scan.nextLine());
//            contacts.add(contact);
//        }
        System.out.println(contacts);
    }
}