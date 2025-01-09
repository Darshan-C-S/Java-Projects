package com.example.Junit;

public class Grader {

    public char determinLetterGrader(int number){

        if(number <0){
            throw new IllegalArgumentException("The Number cannot be -ve");
        } else if (number < 60) {
            return 'D';
        } else if (number <70) {
            return 'C';
        } else if (number<80) {
            return 'B';
        }else if(number<90){
            return 'A';
        }else {
            return 'S';
        }

    }

}
