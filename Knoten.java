private class Knoten<T> {
    private T zeigeAuf;         // Speichert das Objekt, auf das der Knoten zeigt
    private Knoten<T> nachfolger; // Speichert den Verweis, auf den nachfolgenden Knoten

    // Konstruktor um den Knoten mit einem Wert zu initialisieren
    public Knoten(T pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
        this.nachfolger = null; // Initialisiert den Nachfolger mit null
    }

    // Getter für den nächsten Knoten
    public Knoten<T> getNachfolger() {
        return nachfolger;
    }

    // Setter für den nächsten Knoten
    public void setNachfolger(Knoten<T> pNachfolger) {
        this.nachfolger = pNachfolger;
    }

    // Getter für das Objekt auf das der Knoten zeigt
    public T getZeigeAuf() {
        return zeigeAuf;
    }

    // Setter für das Objekt auf das der Knoten zeigt
    public void setZeigeAuf(T pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
    }
}
