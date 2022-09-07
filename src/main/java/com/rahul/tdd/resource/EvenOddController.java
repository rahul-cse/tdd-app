package com.rahul.tdd.resource;

import com.rahul.tdd.util.EvenOddNumberUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("demo")
@RestController
@AllArgsConstructor
public class EvenOddController {

    EvenOddNumberUtil evenOddNumberUtil;

    @GetMapping("/even")
    public List<Integer> getEvenNumbers(@RequestParam("numbers") String numbers) {
        List<Integer> intNumbers = Arrays.stream(numbers.split(","))
                .map(num -> Integer.parseInt(num))
                .collect(Collectors.toList());
        return evenOddNumberUtil.getEvenNumber(intNumbers);
    }
}
