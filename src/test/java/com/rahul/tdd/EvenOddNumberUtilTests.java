package com.rahul.tdd;

import com.rahul.tdd.util.EvenOddNumberUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddNumberUtilTests {

    EvenOddNumberUtil evenOddNumberUtil = new EvenOddNumberUtil();

    @Test
    public void testEvenNumber(){
        List<Integer> numbs = List.of(0, 1, 2, 3, 4, 5, 6);
        List<Integer> result = evenOddNumberUtil.getEvenNumber(numbs);
        assertEquals(result, List.of(0,2,4,6));
    }

    @Test
    public void testOddNumber(){
        List<Integer> numbs = List.of(0, 1, 2, 3, 4, 5, 6);
        List<Integer> result = evenOddNumberUtil.getOddNumber(numbs);
        assertEquals(result, List.of(1,3,5));
    }
}
