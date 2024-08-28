 import java.util.Scanner;
 
 public class Palindrome1{
	 public static void main(String[] args){
 			String s1;
 			int len = 0,i;
 			boolean flag = true;
 			char[] ar = new char[20];
 			Scanner sc = new Scanner(System.in);
 		 	System.out.println("Enter a string ");
 		 	while (ar[i] != "\0"){
 		 	ar[i].append(sc.nextChar());
 		 	i++;
 		 	}
 		 	len = i;
 		 	for(i = 0;i<len;i++){
 		 		if (ar[i] != ar[len-i]){
 		 		flag = true;
 		 		break;
 		 	}
 		 	}
 		 	if(flag){
 		 		System.out.println(s1+"is not a palindrome");
 		 	}
 		 	else{
 		 		System.out.println(s1+"is a palindrome");	
 		 	}
 }	
 	
 }
