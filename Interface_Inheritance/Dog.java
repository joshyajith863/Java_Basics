    /*
    *Ajith Joshy
    *2021-10-25
    *This is a simple code to implement Interfacewith Inheritance
    */
    //Importing the scanner class to get input 
 import java.util.Scanner;
 public class Dog extends Animal{
    public Dog(int legs){
        super(legs);
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void getName(){
        if(name != null){
            return name;
        }
        else{
            System.out.println("Please provide a name ");
        }
    }
    public void play(){
        System.out.println(Name +"is playing");
    }
    public static void main(String [] args){
        Dog dog = new Dog();
        //Created an instance for the object dog
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the dog");
        String name = sc.nextLine();
        dog.setName(name);
        System.out.println(dog.getName() + "is your petdog....");
        dog.play();
    }

 }