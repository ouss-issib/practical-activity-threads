public class Talkative implements Runnable {

    private int number;


    public Talkative(int number){
        this.number = number;
    }


    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }


    @Override
    public void run() {
        for(int i = 1; i <= 100; i++){
            System.out.println(getNumber());
        }
    }
}
