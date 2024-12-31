package Dictionaryops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiDMaps {

    public static  List<Integer> getAllGrades(Map<String, Map<String, Integer>> studentGrades , String student){

        return studentGrades.get(student).values().stream().toList();
    }

    public  static  int getIndividualSubjectGrades(Map<String, Map<String, Integer>> studentGrades , String student , String subject){
        return studentGrades.get(student).get(subject);
    }

    public static void updateIndividualSubjectGrades(Map<String, Map<String, Integer>> studentGrades , String student , String subject , int Marks){
        try {
            studentGrades.get(student).put(subject , Marks);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static  void removeIndividualSubject(Map<String, Map<String, Integer>> studentGrades , String student , String subject ){
        try {
            studentGrades.get(student).remove(subject);
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        /*
        * Create a data structure to store the grades of students in different subjects.
        * For each student, you should be able to:
        * Store grades for multiple subjects.
        * Retrieve the grade of a student for a specific subject.
        * Update the grade of a student in a specific subject.
        * Display all subjects and grades for a student.
        * */

        // Multidimensional map: Student -> Subject -> Grade
        Map<String, Map<String, Integer>> studentGrades = new HashMap<>();

        studentGrades.put("Darshan" , new HashMap<>());
        studentGrades.get("Darshan").put("Math" , 90);
        studentGrades.get("Darshan").put("Since" , 95);
        studentGrades.get("Darshan").put("English" , 96);
        studentGrades.get("Darshan").put("UUUU" , 00);

        System.out.println(studentGrades.get("Darshan"));

        studentGrades.put("Harini" , new HashMap<>());
        studentGrades.get("Harini").put("Math" , 90);
        studentGrades.get("Harini").put("Since" , 92);
        studentGrades.get("Harini").put("English" , 93);


// Store grades for multiple subjects for each students.
        List<Integer> Darshanli = getAllGrades(studentGrades, "Darshan");
        System.out.println("The Grades of Darshan in list  : "+Darshanli);

        List<Integer>HariniLs = studentGrades.get("Harini").values().stream().toList();
        System.out.println("The Grade List of Harini is : "+ HariniLs);

//     Retrieve the grade of a student for a specific subject.

        int DarshanMathGrade = getIndividualSubjectGrades(studentGrades , "Darshan" , "Math");
        int HariniEngGrade = studentGrades.get("Harini").get("English");

        System.out.println("Specific Grades of Darshan in Math : "+DarshanMathGrade + " and Harini's Grade in English : "+ HariniEngGrade);

//     update the grade of a student for a specific subject.
        updateIndividualSubjectGrades(studentGrades , "Darshan" , "English" , 96); ;
        studentGrades.get("Harini").put("Math",92);

        System.out.println("Darshan marks after updating English grade : "+studentGrades.get("Darshan"));
        System.out.println("Harini's marks after updating Math grade : "+studentGrades.get("Harini"));

        removeIndividualSubject(studentGrades, "Darshan" , "UUUU");
        System.out.println("After Removing a indivisual subject in Darshan : "+ studentGrades.get("Darshan"));




    }
}
