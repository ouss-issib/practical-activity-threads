import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int nombreThreads = 3;
        int taillePlage = tableau.length / nombreThreads;

        ExecutorService executor = Executors.newFixedThreadPool(nombreThreads);
        Sommeur[] sommeurs = new Sommeur[nombreThreads];

        for (int i = 0; i < nombreThreads; i++) {
            int debut = i * taillePlage;
            int fin = (i == nombreThreads - 1) ? tableau.length : (i + 1) * taillePlage;
            Sommeur sommeur = new Sommeur(tableau, debut, fin);
            sommeurs[i] = sommeur;
            executor.submit(sommeur);
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sommeTotale = 0;
        for (Sommeur sommeur : sommeurs) {
            sommeTotale += sommeur.getSomme();
        }

        System.out.println("Somme totale: " + sommeTotale);
    }
}
