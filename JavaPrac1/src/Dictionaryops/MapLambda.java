package Dictionaryops;

import java.util.HashMap;

public class MapLambda {
    public static void main(String[] args) {

/* Here all the possible expression like stream ops in list are available */

        HashMap<Integer , String> studentDetails = new HashMap<>();

        studentDetails.put(1,"Darshan");
        studentDetails.put(2,"Katyaeni");
        studentDetails.put(3,"Ragav");
        studentDetails.put(4,"Dev");

        studentDetails.forEach((k,v)->{if (k %2 == 0){
            System.out.println("The even id's :"+k +" and name : "+ v);
        }});




    }
}
