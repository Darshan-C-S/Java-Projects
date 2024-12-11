package OOPS;


public class DogConstructorTypes {
    String name;
    int age;

//    Default Constrouctor
    DogConstructorTypes(){
        this.name = "Unknown";
        this.age = 0;

    }
//    Parameterised constructor
    DogConstructorTypes(String name , int age){
        this.name = name;
        this.age = age;
    }

//    Single Parameter Constructor
    DogConstructorTypes(int age){
        this.age    = age;
        this.name = "Unknown";
    }
//    Copy Constructor

    DogConstructorTypes(DogConstructorTypes parentDog){
        this.name = parentDog.name;
        this.age  = parentDog.age;
    }


    public static void main(String[] args) {

        DogConstructorTypes d = new DogConstructorTypes( "Ronni", 8 );
        System.out.println("Name : "+ d.name + " age : "+d.age);

//        Copy of the primary constructor
        DogConstructorTypes d2 = new DogConstructorTypes(d);

        System.out.println("" +
                "Copied name : "+ d2.name+ " age : "+d2.age );


    }
}
