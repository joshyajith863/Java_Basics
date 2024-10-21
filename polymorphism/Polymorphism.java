public class Polymorphism {
   
    abstract class Shape {
        abstract void Noofsides();
    }

    
    class Rectangle extends Shape {
        @Override
        void Noofsides() {
            System.out.println("Rectangle has 4 sides");
        }
    }

    
    class Triangle extends Shape {
        @Override
        void Noofsides() {
            System.out.println("Triangle has 3 sides");
        }
    }

    
    class Hexagon extends Shape {
        @Override
        void Noofsides() {
            System.out.println("Hexagon has 6 sides");
        }
    }

    
    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        
        
        Shape rectangle = poly.new Rectangle();
        Shape triangle = poly.new Triangle();
        Shape hexagon = poly.new Hexagon();

        
        rectangle.Noofsides();
        triangle.Noofsides();
        hexagon.Noofsides();
    }
}
