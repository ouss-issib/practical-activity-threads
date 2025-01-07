public class Main {
    public static void main(String[] args) {
        //Programme du test

        for (int i = 0; i < 10; i++) {
            int number = i+1;
            Talkative talkative = new Talkative(number);
            Thread talkativeThread = new Thread(talkative);
            talkativeThread.start();
        }

    }
}