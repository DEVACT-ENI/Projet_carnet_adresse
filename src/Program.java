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
        System.out.println(contacts);
    }
}