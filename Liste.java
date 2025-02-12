import jdk.jfr.ContentType;

public class Liste <T> {
    public KnotenListe <T> Erster;
    public KnotenListe <T> Letzer;
    public KnotenListe <T> Aktuelle;




public class Liste <T>   {

}

public void remove () {
    KnotenListe aktuellerKunde = Erster;
    if (Erster != null) {
        Erster = aktuellerKunde.getNachfolger();

    }
}
public void next (){

}
public void append (T pKontent) { KnotenListe ContentType=Erster;

    if (Erster == null){
        Erster = new KnotenListe<>(pKontent);
    }
    else{
        while(ContentType.getNachfolger() != null) {
            ContentType = ContentType.getNachfolger();
        }
        ContentType.setNachfolger(new KnotenListe(pKontent));
    }

}



}
