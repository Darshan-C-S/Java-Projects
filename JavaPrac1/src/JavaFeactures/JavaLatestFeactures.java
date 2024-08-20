package JavaFeactures;

import java.util.ArrayList;

public class JavaLatestFeactures {
    public static void main(String[] args) {

        //type inference
        var list = new ArrayList<>();
        list.add("Hello All");
        System.out.println(list);

        var he = "Hello";
        System.out.println(he.length());




        //Enhanced switch statement with pattern matching.
        String shape= "circle";
        switch (shape){
            case "circle" -> System.out.println("This is Circle");
            case "Triangle" -> System.out.println("This is Triangle ");
            case "Square" -> System.out.println("This is Square");
            case "Rhombus" -> System.out.println("This is Rhombus");
            default -> System.out.println("No shape is listed");
        }

        String greads = "A";

        switch (greads){
            case "D" -> System.out.println("Just passed");
            case "C" -> System.out.println("Passed");
            case "B" -> System.out.println("Passed with Distinction");
            case "A" -> System.out.println("Crazy");

        }

        //Pattern Matching for instanceof
        Object a = "Hello World";
        if(a instanceof String s){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Text Blocks
        String html = """
                .................................
                Hello Message in multiple lines 
                <p>Hello this are Text Blocks!</p>
                ..................................
                """;
        System.out.println(html);


    }
}
