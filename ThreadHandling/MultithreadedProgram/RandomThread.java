import java.util.Random;
public class RandomThread extends Thread{

    public void run(){
        try{
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                int num = r.nextInt(100);
                Thread.sleep(10);
                if(num%2 != 0) {
                    new OddThread(num);
                }else {
                    new EvenThread(num);
                }
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
