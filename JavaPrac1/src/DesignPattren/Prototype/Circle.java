package DesignPattren.Prototype;

public class Circle implements Shape {
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    // This creates a copy of the circle.
    @Override
    public Shape clone(){
        try {
//            Here we are creating the deep copy of the instance
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }

    }
    @Override
    public void drow(){
        System.out.println("The radius is : "+ radius);
    }



}
