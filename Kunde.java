public class Kunde {
    private String name; // Der Name des Kunden

    // Standard-Konstruktor ohne Parameter
    public Kunde() {
        // Wird verwendet, um ein Kunde-Objekt ohne Initialisierung des Namens zu erstellen
    }

    // Konstruktor, um ein Kunde-Objekt mit einem Namen zu erstellen
    public Kunde(String pName) {
        this.name = pName; // Initialisiert den Namen mit dem angegebenen Wert
    }

    // Setzt den Namen des Kunden
    // Falls der Name 'null' ist, könnte eine Ausnahme geworfen oder eine Validierung hinzugefügt werden
    public void setName(String pName) {
        if (pName == null) {
            System.out.println("Der Name darf nicht null sein!");
            return;
        }
        name = pName; // Setzt den Namen des Kunden
    }

    // Gibt den Namen des Kunden zurück
    public String getName() {
        return name; // Gibt den Namen des Kunden zurück
    }
}
