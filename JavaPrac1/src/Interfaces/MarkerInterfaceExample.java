package Interfaces;


import java.io.*;

class Student implements Serializable{
    int id;
    String name;

    Student(int id  , String name){
        this.id = id;
        this.name = name;
    }


}
public class MarkerInterfaceExample {
    public static void main(String[] args) throws IOException {

        Student student = new Student(1 , "Darshan");
        FileOutputStream fileOutputStream = new FileOutputStream("student.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object is successfully serialized ");



    }
}
