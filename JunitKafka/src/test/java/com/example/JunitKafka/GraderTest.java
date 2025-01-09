package com.example.JunitKafka;

import com.example.Junit.Grader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    Grader grader = new Grader();
    @Test
    void fiftynineShouldReturnF() {
//        Grader grader = new Grader();
        assertEquals(grader.determinLetterGrader(59),'F');
    }
    @Test
    void sixtynineShouldReturnD() {
        assertEquals('D',grader.determinLetterGrader(69));
    }
    @Test
    void seventynineShouldReturnC() {

        assertEquals('C',grader.determinLetterGrader(79));
    }
    @Test
    void eightynineShouldReturnB() {
        assertEquals('B',grader.determinLetterGrader(89));
    }
    @Test
    void nintynineShouldReturnA() {
        assertEquals('A',grader.determinLetterGrader(99));
    }
    @Test
    void negetiveReturnIllegelArgumentException(){
        // to test the exception we need to put the function inside lambda to catch and compare the exception produced
        assertThrows(IllegalArgumentException.class , () ->{
            grader.determinLetterGrader(-1);
        });
    }
    @Test
    void neag(){
        assertThrows(IllegalArgumentException.class , () -> {grader.determinLetterGrader(-9);});
    }
)
}