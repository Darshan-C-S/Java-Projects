package OOPS;

//if you want anything that belongs (variables methods etc..)to the class make it static
/*  Note : Static methods cannot be overridden by other classes or sub classes  */
class Product{
    //Attributes are the textual representation of the objects in memory
    //private int pid;
    int pid;
    String name;
    int prise;

//constructor
    Product(){
        System.out.println("======== Product object is constructed ========");
    }

    void setProductDetails(int pid , String name , int prise){
        this.pid = pid;
        this.name = name;
        this.prise = prise;
        System.out.println(">>>> Product object is mapped  <<<<  ");
    }

    void showProductDetails(){
        System.out.println("pid: "+pid);
        System.out.println("Name : "+name);
        System.out.println("Prise : "+prise);
    }
// Here the setPid is used to set the pid when pid is private
    void setPid(int pid){
        this.pid = pid;
    }
}

class Mobile extends Product{
//   Above is example of inheritance its IS-A relation Mobile IS-A Product , Mobile Child and Product is Parent

    String os;
    int ram;
    int sdCardSize;
    Mobile(){
        System.out.println(">>>> Mobile object created <<<<");
    }
/* setProductDetails of the mobile class is an example of method overloading

METHOD OVERLOADING: the methods are having same name but different parameter, its compile time polymorphism

here the arguments must be different in datatype or different arguments used in method from parent class
 */
    void setProductDetails(int pid , String name , int prise, String os , int ram , int sdCardSize){
        this.pid = pid;
        this.name = name;
        this.prise = prise;
        this.os = os;
        this.ram = ram;
        this.sdCardSize = sdCardSize;
        System.out.println(">>>> Mobile object is mapped  <<<<  ");
    }

    /* Before adding the showProductDetails to the child class mobile it was using the method from parent class
    but now it will use it from the child class as its redefined

    METHOD OVERRIDING : If subclass (child class) has the same method as declared in the parent class and sometimes
    implements in its own way , it is known as method overriding in Java ,its run time polymorphism

    here the method arguments must be similar and return type must be same to parent class
     */
    void showProductDetails(){
        System.out.println("pid : "+pid);
        System.out.println("Name : "+name);
        System.out.println("Prise : "+prise);
        System.out.println("OS : "+os);
        System.out.println("Ram : "+ram);
        System.out.println("Sd card Size : "+ sdCardSize);
    }
}

public class InheritenceApp {
    public static void hello(){
        System.out.println("hello all");
    }
    public static void main(String[] args) {

//        Product product = new Product();
        // here the product is the reference to the product class which has hexadecimal value of the address
/*   Below we are adding the data directly to the product object
* Note: the direct modification of the objects are not possible if the class attributes are private
* */
        /*
//        product.pid = 1;// this line is error as private attributes can't be accessed directly so have set pid method separately
//        product.name = "Computer";
//        product.prise = 200000;
//        product.showProductDetails();

        product.setProductDetails(1,"Computer",200000);// adding data to product object using setProductDetails method
        product.showProductDetails();
*/
        Mobile mobile = new Mobile();
        mobile.setProductDetails(2,"Samsung S23",700000,"Android",12 , 128);
        mobile.showProductDetails();

        InheritenceApp.hello();



    }
}
