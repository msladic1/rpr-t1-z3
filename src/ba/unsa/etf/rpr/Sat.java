package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati, minute, sekunde);
    }

    public void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati; this.minute = minute; this.sekunde = sekunde;
    }

    public void Sljedeci(){
        sekunde = sekunde + 1;
        if (sekunde==60) {
            sekunde=0;
            minute = minute +1;
        }
        if (minute==60) {
            minute=0;
            sati = sati + 1;
        }
        if (sati==24) sati=0;
    }

}
