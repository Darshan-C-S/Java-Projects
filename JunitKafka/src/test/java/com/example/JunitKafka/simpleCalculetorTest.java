package com.example.JunitKafka;

import com.example.Junit.simpleCalculetor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class simpleCalculetorTest {
// Tip : make sure to have more than one unit testing function for a scenario to cover the corner cases
    @Test
    void twoPlusTwo(){
        simpleCalculetor calculetor = new simpleCalculetor();
        int result =  calculetor.add(2,2);
        assertEquals(result,4);
    }
    @Test
    void threePlusSeven(){
        simpleCalculetor calculetor = new simpleCalculetor();
        int result =  calculetor.add(3,7);
        assertEquals(result,10);
    }
    @Test
    void NotEqualTest(){
        simpleCalculetor calculetor = new simpleCalculetor();
        int res = calculetor.add(3,13);
        assertNotEquals(res, 10 );
    }

    @Test
    void NoEqualsTo(){
        simpleCalculetor calculetor = new simpleCalculetor();
        int res = calculetor.add(2,6);
        assertEquals(res , 8);
    }

// We use ParameterizedTest to run same test with different parameters
    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5,6,7})
    void calCheckValuesList(int val) {
        assertTrue(val %2 == 2);
    }

}