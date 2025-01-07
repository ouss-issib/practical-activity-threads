import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3000);
        for (int i = 0; i < 20000; i++) {
            executorService.submit(new ClasseThread1("T"+i));
        }
        executorService.shutdown();
        System.out.println("Hello, World!");
    }
}