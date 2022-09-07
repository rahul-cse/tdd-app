package com.rahul.tdd.resource;

import com.rahul.tdd.util.EvenOddNumberUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EvenOddControllerTest {

    EvenOddNumberUtil evenOddNumberUtil = mock(EvenOddNumberUtil.class);

    EvenOddController evenOddController = new EvenOddController(evenOddNumberUtil);

    @Test
    void getEvenNumbers() {
        when(evenOddNumberUtil.getEvenNumber(List.of(100, 105, 109, 114))).thenReturn(List.of(100, 114));
        List<Integer> result = evenOddController.getEvenNumbers("100,105,109,114");
        assertEquals(result, List.of(100, 114));
    }
}
