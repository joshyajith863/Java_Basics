 import java.util.Scanner;
 public class Shape{
 	public class shape_area{
 		public class Triangle{
 			
 			float calcArea(float length,float height){
 				return length*width*.5;
 			}
 		}
 		public class Rectangle{
 			float calcArea(float length,float width){
 				return length*width;
 			}
 		}
 		public class Circle{
 			float calcArea(int radius){
 				return 3.14 * radius * radius;
 			}
 		}
 		public static void main(String[] args){
 		    System.out.println("Ajith Joshy");
 			Scanner sc = new Scanner(System.in);
 			float length,width,radius,base,height;
 			Rectangle rectangle = new Rectangle();
 			Circle circle = new Circle();
 			Triangle triangle = new Triangle();
 			System.out.println("Enter the dimensions of the rectangle :");
 			length = sc.nextFloat();
 			width = sc.nextFloat();
 			System.out.println("Enter the dimensions of the triangle :");
 			base = sc.nextFloat();
 			heigth = sc.nextFloat();
 			System.out.println("Enter the radius of the circle :");
 			radius = sc.nextFloat;
 			System.out.println("The Area's of the given shapes are :");
 			System.out.println("Rectangle :"+rectangle.calcArea(length,width));
 			System.out.println("Circle :"+circle.calcArea(radius));
 			System.out.println("Triangle :"+triangle.calcArea(base,height)
 		}
 	}
 } 
