package DesignPattren.Prototype;

public class Rectangle implements Shape{
    int width;
    int height;

    Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }

    // This creates a copy of the rectangle.
    @Override
    public Shape clone(){
        try {

//            Here we are creating the deep copy of the instance
           return (Rectangle) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    @Override
    public void drow(){

        System.out.println("The width is : "+ width + " and the height is : "+ height);
    }
}
