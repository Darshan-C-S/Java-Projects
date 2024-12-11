package DesignPattren.Prototype;

public class Prototype {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(1,2);
        Shape clonedRectangle  = rectangle.clone();

        rectangle.drow();
        clonedRectangle.drow();

        Shape circle = new Circle(2);
        Shape clonedCircle = circle.clone();

        circle.drow();
        clonedCircle.drow();

        Shape  square = new Square(8);
        Shape clonedSquare = square.clone();

        square.drow();
        clonedSquare.drow();

    }
}
