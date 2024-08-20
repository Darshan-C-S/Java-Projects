package OOPS;

import DSA.SortingAlgo;

//This is Abstraction where the unwanted details are hiding and only given the necessary functionality
//Here Interface and Abstraction is example of runtime polymorphism
interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

interface thirdInterface{
    /* From Java 8 onward you can have a non-abstract method inside the interface, prior to that
    it was not allowed as all method was implicitly public abstract. From JDK 8, you can add static
    and default methods inside an interface.*/
    public static void hi(){
        System.out.println("Hello ");
    }

    public  default void hello(){
        System.out.println("Hi");
    }
}


// This is the example to demonstrate the use of interfaces with multiple Abstract methods
interface MultpleAbstractMethodAnimal{
    void eat();
    void sleep();

}

// DemoClass "implements" FirstInterface and SecondInterface
//In interface we can indirectly have multiple inheritance
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class DemoClass1 implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Hello All 1");
    }
    public void myOtherMethod() {
        System.out.println("Hello All 2");
    }
}
class Dog implements MultpleAbstractMethodAnimal{
    public void eat(){System.out.println("The Dog is eating");}
    public void sleep(){System.out.println("The dog is sleeping");}
}
class Cat implements MultpleAbstractMethodAnimal{
    public void eat(){System.out.println("The Cat is eating");}
    public void sleep(){System.out.println("The Cat is sleeping");}
}


class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();

        DemoClass1 myObj1 = new DemoClass1();
        myObj1.myMethod();
        myObj1.myOtherMethod();


        Dog d = new Dog();
        d.eat();
        d.sleep();

        Cat c = new Cat();
        c.eat();
        c.sleep();


    }
}
