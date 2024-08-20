package ArraysList;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

// https://chatgpt.com/c/570b8c54-f70c-4c6f-8488-cdc67156752e

class Person{
    private String name;
    private int age;
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    public  int getAge() {
        return age;
    }
    public  String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name = (name);
    }

    @Override
   public String toString(){
        return "{ name : " + name +  " , age : " + age+ "}";
    }
}
public class ListOfClassObjects {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Darshan",25));
        people.add(new Person("Radha",23));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 28));

//        Itterate Through the list

        System.out.println("====== list Iteration ======");
        for(Person p : people){
            System.out.println(p);
        }

//        To filter out the list of people whose age is less than 28
        List<Person> ageLimit = people.stream().filter(x->x.getAge() < 28).collect(Collectors.toList());
        System.out.println("People whose age is less than 28: "+ageLimit);

//        Sort the people by age
        List<Person> PersonByAge = people.stream().sorted((p1,p2)-> Integer.compare(p1.getAge(),p2.getAge())).collect(Collectors.toList());
        System.out.println("List after Sorting the people by age : "+ PersonByAge);

//        Sort the peaople by name
        List<Person> SortByName = people.stream().sorted((p1,p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        System.out.println("List after Sorting the people by first letter of the name : "+ SortByName);


        Long CountPeopleBetween22and25 = people.stream().filter(x -> 22 <= x.getAge() && x.getAge() <=25).count();
        System.out.println("Count People Between 22 and 25 : "+ CountPeopleBetween22and25);

//        To get all the names in the list
        List <String> PersonName = people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("All the names in the list : "+PersonName);

//        To get the sum and avg of all ages i the list
        int SumOFAges = people.stream().map(Person::getAge).reduce(0,Integer::sum);
        System.out.println("The sum of all the ages are : "+ SumOFAges);
        int avg = SumOFAges/people.size();
        System.out.println("The average i age is : "+ avg);

//        To get the max of all ages i the list
        int MaxOfAges = people.stream().map(Person :: getAge).reduce(0, Integer::max);
        System.out.println("The max of all ages are : "+MaxOfAges);

//        To get the avg of all ages i the list



    }
}
