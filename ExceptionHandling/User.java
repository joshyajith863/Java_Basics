import java.util.Scanner;

public class User{
  public static void main(String [] args){
        int userAge;
        System.out.println("Enter the age :");
        Scanner sc = new Scanner(System.in);
        userAge = sc.nextInt();

       try{
         AgeVerify age = new AgeVerify(userAge);
       }
       catch(Exception e){
        System.out.println("Exception :"+e);
       }
      sc.close();
    }
}