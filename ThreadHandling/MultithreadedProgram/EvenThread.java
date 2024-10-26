
public class EvenThread extends Thread{
    private  int num;
    EvenThread(int num){
        super("Even");
        this.num = num;
        start();
    }
    public void run(){
        System.out.println("Square of "+num+"="+num*num);
    }
}