    /*
    *Ajith Joshy
    *2021-10-25
    *This is a simple code to implement Interfacewith Inheritance
    */
    //Importing the scanner class to get input 
 import java.util.Scanner;

// Dog class extends Animal and implements the Pet interface
public class Dog extends Animal implements Pet {
    private String Name;

    public Dog(int legs) {
        super(legs);  // Calls Animal constructor
    }

    // Implementation of setName method from Pet interface
    public void setName(String Name) {
        this.Name = Name;
    }

    // Implementation of getName method from Pet interface
    public String getName() {
        if (this.Name != null) {
            return this.Name;
        } else {
            return "Please provide a name";
        }
    }

    // Implementation of play method from Pet interface
    public void play() {
        System.out.println(Name + " is playing");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(4);  // Creates Dog object with 4 legs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the dog:");
        String name = sc.nextLine();
        dog.setName(name);

        System.out.println(dog.getName() + " is your pet dog...");
        dog.play();
    }
}
