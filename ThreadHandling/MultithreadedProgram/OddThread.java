public class OddThread extends Thread{
    private  int num;
    public OddThread(int num){
        this.num = num;
    }
    public void run(){
        System.out.println("Square of"+num+"is"+num*num);
    }
}
