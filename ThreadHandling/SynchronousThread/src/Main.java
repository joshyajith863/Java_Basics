public class Main {
    public static void main(String[] args) {
        Callme target = new Callme();
        Call ob1 = new Call("Hello",target);
        Call ob2 = new Call("Ok",target);
        Call ob3 = new Call("World",target);
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Exception" + e.getMessage());
        }

    }
}