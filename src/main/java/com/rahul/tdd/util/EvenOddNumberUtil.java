package com.rahul.tdd.util;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EvenOddNumberUtil {

    public List<Integer> getEvenNumber(List<Integer> numbers) {
        return numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> getOddNumber(List<Integer> numbers) {
        return numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
    }
}
