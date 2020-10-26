package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati, minute, sekunde);
    }

    public void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati; this.minute = minute; this.sekunde = sekunde;
    }


}
