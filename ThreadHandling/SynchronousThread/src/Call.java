public class Call implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Call(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg);
    }
}
