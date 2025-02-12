private class Knoten<T> {
    private T inhalt;             // Speichert das Objekt, das im Knoten enthalten ist
    private Knoten<T> nachfolger; // Verweist auf den nächsten Knoten in der Kette

    // Konstruktor, um den Knoten mit einem Wert zu initialisieren
    public Knoten(T pInhalt) {
        this.inhalt = pInhalt;
        this.nachfolger = null; // Initialisiert den Verweis auf den nächsten Knoten mit null
    }

    // Getter für den nächsten Knoten (Nachfolger)
    public Knoten<T> getNachfolger() {
        return nachfolger;
    }

    // Setter für den nächsten Knoten (Nachfolger)
    public void setNachfolger(Knoten<T> pNachfolger) {
        this.nachfolger = pNachfolger;
    }

    // Getter für das Objekt, das im Knoten gespeichert ist
    public T getInhalt() {
        return inhalt;
    }

    // Setter für das Objekt, das im Knoten gespeichert ist
    public void setInhalt(T pInhalt) {
        this.inhalt = pInhalt;
    }
}
