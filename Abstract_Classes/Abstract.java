public class Abstract {
   
    abstract class Shape {
        abstract void Noofsides();
    }

    
    class Rectangle extends Shape {
        void Noofsides() {
            System.out.println("Rectangle has 4 sides");
        }
    }

    
    class Triangle extends Shape {
        void Noofsides() {
            System.out.println("Triangle has 3 sides");
        }
    }

    
    class Hexagon extends Shape {
        void Noofsides() {
            System.out.println("Hexagon has 6 sides");
        }
    }

    
    public static void main(String[] args) {
        Abstract abs = new Abstract();
        
        
        Shape rectangle = abs.new Rectangle();
        Shape triangle = abs.new Triangle();
        Shape hexagon = abs.new Hexagon();

        
        rectangle.Noofsides();
        triangle.Noofsides();
        hexagon.Noofsides();
    }
}
