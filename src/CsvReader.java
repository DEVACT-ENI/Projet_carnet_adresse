import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Contact> readCsvFile(String filePath) {
        List<Contact> contacts = null;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            contacts = new ArrayList<>();


            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                Contact contact = new Contact();
                contact.setNom(values[0]);
                contact.setPrenom(values[1]);
                contact.setNumeroTelephone(values[2]);
                contact.setAdresseEmail(values[3]);
                contact.setAdressePhysique(values[4]);
                contact.setAutresInformations(values[5]);
                contacts.add(contact);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a pas été trouvé : " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + filePath);
            e.printStackTrace();
        }
        return contacts;
    }
}
