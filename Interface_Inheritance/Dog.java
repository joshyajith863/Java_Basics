/*
*Ajith Joshy
*2021-10-15
*This is a simple program to implement Interface with Inheritance
 */
 //Including the Scanner class to Get input from the user 
import java.util.Scanner;
//Class Dog 
public class Dog extends Animal {
    private String name;  

    //Constructor of the class Dog A
    public Dog(int legs) {
        super(legs);
    }

    //TO set the name for the dog 
    public void setName(String name) {
        t/*
* Ajith Joshy
* 2021-10-15
* This is a simple program to implement Interface with Inheritance
 */

// Including the Scanner class to get input from the user
import java.util.Scanner;

// Class Animal (Assumed as a parent class, though not provided in your code)
class Animal {
    private int legs;

    // Constructor for Animal class
    public Animal(int legs) {
        this.legs = legs;
    }

    // Getter for legs
    public int getLegs() {
        return legs;
    }

    // Setter for legs
    public void setLegs(int legs) {
        this.legs = legs;
    }
}

// Class Dog, which extends Animal
public class Dog extends Animal {
    private String name;  // Name of the dog

    // Constructor of the class Dog with leg parameter
    public Dog(int legs) {
        super(legs); // Calling parent class (Animal) constructor
    }

    // To set the name for the dog 
    public void setName(String name) {
        this.name = name;
    }

    // To get the name of the dog 
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Name not provided";
        }
    }

    // To make the dog play 
    public void play() {
        System.out.println("Dog is playing.");
    }

    // Method to display dog details
    public void displayDetails() {
        System.out.println("Dog has " + getLegs() + " legs.");
        System.out.println("Dog's name is: " + getName());
    }

    // Main function
    public static void main(String[] args) {
        // Creating Dog object with 4 legs (change if desired)
        Dog dg = new Dog(4);

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking for dog name input
        System.out.print("Enter the name of the dog: ");
        String dogname = sc.nextLine();

        // Setting the dog's name and displaying details
        dg.setName(dogname);
        dg.displayDetails();

        // Simulating dog's play
        dg.play();

        // Closing Scanner object to prevent resource leaks
        sc.close();
    }
}
his.name = name;
    }
    //To get the name of the dog 
    
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Name not provided";
        }
    }
    //To make the dog play 
    public void play(){
        System.out.println("Dog is playing ");
    }
    
    public void displayDetails() {
        System.out.println("Dog has " + getLegs() + " legs.");
        System.out.println("Dog's name is: " + getName());
    }

    //Main Function
    public static void main(String[] args) {
       Dog dg = new Dog(0);
       Scanner sc = new Scanner(System.in);
       String dogname;
       dogname = sc.nextLine();
       dg.setName(dogname);
       dg.getName();
       dg.play();
    }
}
