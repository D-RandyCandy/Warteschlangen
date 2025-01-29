public class Verwaltung {
    public static void main(String[] args){

    }
        public Verwaltung(){
        scanner = new Scanner(System.in);
        Warteschlange warteschlange = new Warteschlange();
        while (true) {
            System.out.println("==Hauptmenü==");
            System.out.println("[1]Hinzufügen");
            System.out.println("[2]Erstes Auslesen");
            int option = scanner.nextInt();
            if (option==1) {
                System.out.println("Wie viele willst du");
                option = scanner.nextInt();
                for (int i=0;i<option;i++){
                    warteschlange.einfuegen(new Kunde(pName""));
                }else if
            }
        }
        }
}
