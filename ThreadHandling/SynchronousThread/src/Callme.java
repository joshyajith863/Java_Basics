import java.sql.SQLOutput;

public class Callme {
    synchronized void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        System.out.print("]");
    }
}
