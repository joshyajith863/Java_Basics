import java.util.Scanner;

public class calculator{
 public void operation(int num1,int num2,char operation){
 	switch(operation){
 		case '+' : System.out.println("Sum is :"+this.num1+this.num2);
 					break;
		case '-' :System.out.println("difference is :"+this.num1-this.num2);
					break;
		case '*' :System.out.println("Product is :"+this.num1*this.num2);
					break;
		case '/' :System.out.println("Division is:"+this.num1/this.num2);
					break;
					
		default  :System.out.println("Invalid Statement....");
 	}
 	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
 		
 	}
 }
	
}
