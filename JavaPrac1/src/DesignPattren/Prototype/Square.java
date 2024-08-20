package DesignPattren.Prototype;

public class Square implements Shape{

    int side;

    Square(int side){
        this.side = side;
    }

    // This creates a copy of the square.
    @Override
    public Shape clone(){

        try {
            //            Here we are creating the deep copy of the instance
           return (Square) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    @Override
    public void drow(){
        System.out.println("The sides of the square are : "+side);
    }
    
}
