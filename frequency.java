import java.util.*;
public class frequency{
	public static void main(String[] args){
		String s1;
		int count = 0,len;
		char key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		s1 = sc.nextLine();
		System.out.println("Enter the character you want to find out :");
		key = sc.next().charAt(0);
		len = s1.length();
		for(int i = 0;i < len;i++){
			if(s1.charAt(i)==key){
				count++;
		}
		
		}
		System.out.println("The count of" + key +" is :"+ count ); 
	}
}
