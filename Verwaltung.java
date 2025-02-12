import java.util.Scanner;

public class Verwaltung {

    private Scanner scanner;

    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Willkommen zur Zeichenketten Verschluesslung!");

    }
    public Verwaltung(){
        scanner = new Scanner(System.in);
        Warteschlange warteschlange= new Warteschlange();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[0]Abbrechen");
            System.out.println("[1]Hinzufuegen eines Kunden in die Warteschlange");
            System.out.println("[2]Manuelles Hinzufuegen eines Kunden in die Warteschlange");
            System.out.println("[3]Entferne einen Kunden aus der Warteschlange");
            System.out.println("[4]Hinzufuegen eines Kunden im Stack");
            System.out.println("[5]Entfernen eines Kunden im Stack");
            System.out.println("[6]Hinzufuegen eines Kunden in der Liste");
            System.out.println("[7]Entfernen eines Kunden in der  Liste");
            int option = scanner.nextInt();
            scanner.nextLine();





        }
    }
}