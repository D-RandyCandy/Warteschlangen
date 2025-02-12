public class Warteschlange<T> {

    // 'erster' verweist auf das erste Element in der Warteschlange (First-In)
    private Knoten<T> erster;

    // 'letzter' verweist auf das letzte Element in der Warteschlange (Last-In)
    private Knoten<T> letzter;

    // Konstruktor der Warteschlange, initialisiert die Warteschlange als leer
    public Warteschlange() {
        erster = null;
        letzter = null;
    }

    // Gibt den Inhalt des ersten Elements in der Warteschlange zurück
    // Gibt null zurück, wenn die Warteschlange leer ist
    public T gibErsten() {
        if (erster == null) {
            System.out.println("Die Warteschlange ist leer!");
            return null; // Gibt null zurück, wenn die Warteschlange leer ist
        }
        return erster.getContent(); // Gibt den Inhalt des ersten Knotens zurück
    }

    // Entfernt das erste Element aus der Warteschlange (First-Out)
    // Wenn die Warteschlange nach dem Entfernen leer ist, wird auch der 'letzte' Verweis auf null gesetzt
    public void entfernen() {
        if (erster != null) {
            // Der erste Knoten wird entfernt, indem der 'erster'-Verweis auf den nächsten Knoten gesetzt wird
            erster = erster.getNext();
            // Wenn die Warteschlange nun leer ist (erster ist null), setzen wir auch 'letzter' auf null
            if (erster == null) {
                letzter = null;
            }
        } else {
            System.out.println("Die Warteschlange ist leer, es gibt nichts zu entfernen!");
        }
    }

    // Fügt ein neues Element am Ende der Warteschlange hinzu (Last-In)
    public void einfuegen(T pContent) {
        // Erstellen eines neuen Knotens mit dem gegebenen Inhalt
        Knoten<T> neuerKnoten = new Knoten<>(pContent);

        // Wenn die Warteschlange leer ist, wird der neue Knoten sowohl der erste als auch der letzte Knoten
        if (erster == null) {
            erster = neuerKnoten;
            letzter = erster; // Der neue Knoten ist jetzt auch der letzte
        } else {
            // Wenn die Warteschlange nicht leer ist, wird der neue Knoten zum Nachfolger des aktuellen letzten Knotens
            letzter.setNext(neuerKnoten);
            letzter = neuerKnoten; // Der neue Knoten wird zum letzten Knoten
        }
    }

    // Innere Klasse für die Knoten, die die Warteschlange repräsentieren
    private static class Knoten<T> {
        private T content; // Der Inhalt des Knotens
        private Knoten<T> next; // Der Verweis auf den nächsten Knoten

        // Konstruktor für einen Knoten, setzt den Inhalt und initialisiert den 'next'-Verweis auf null
        public Knoten(T content) {
            this.content = content;
            this.next = null;
        }

        // Getter für den Inhalt des Knotens
        public T getContent() {
            return content;
        }

        // Getter für den nächsten Knoten
        public Knoten<T> getNext() {
            return next;
        }

        // Setter für den nächsten Knoten
        public void setNext(Knoten<T> next) {
            this.next = next;
        }
    }
}
