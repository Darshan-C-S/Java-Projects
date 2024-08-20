package DesignPattren.Singleton;

/*

 The Singleton Pattern is a creational design
 pattern that ensures a class has only one instance and
 provides a global point of access to it. This pattern is particularly
 useful when exactly one object is needed across the system

 Make field to store the object private
 To make singleton keep the constructor private
 Create the object with method example is getInstance


 */

public class SingleTon {
    private static  SingleTon instance;
    private SingleTon(){}

//    Lazy initialization of single ton object
//    we male the creation block of getInstance synchronized to make sure to create single
//    instance while multiple threads are accessing
     static SingleTon getInstance(){
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null){
                    instance = new SingleTon();
                }
            }


        }
        return instance;
    }





    public static void main(String[] args) {

        SingleTon ins =  new SingleTon();
        SingleTon ins1 = new SingleTon();
        System.out.println(ins.getInstance());
        System.out.println(ins1.getInstance() == ins.getInstance());

        Jalebi jalebi1 = new Jalebi();
        Jalebi jalebi2 = new Jalebi();

        System.out.println(jalebi1.getInstance());
        System.out.println(jalebi2.getInstance());
        System.out.println(jalebi1.getInstance() == jalebi2.getInstance());



    }

}
