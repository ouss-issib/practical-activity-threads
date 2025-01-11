public class Sommeur implements Runnable {

    int debut,fin,somme;
    int [] tab;

    public Sommeur( int[] tab,int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
        this.tab = tab;
    }

    public int getSomme(){
        return somme;
    }

    @Override
    public void run() {
        for (int i = debut; i < fin; i++) {
            somme += tab[i];
        }
    }
}
