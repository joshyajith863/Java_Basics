import java.util.Scanner;
public class Fibonacci{
	public int fibonacci(int n){
	if (n==0){
	 return 1;
	}
	else{
	return fibonacci(n-1)+fibonacci(n-2);
	}
	}
	public static void main(String[] args ){
		Fibonacci fib = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number :");
		a = sc.newByte();
		System.out.println("The fibonacci series is "+fib.fibonacci(a) + ",");
		
	}
}
