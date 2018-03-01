package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (Integer n=0; n<numbers.size(); n++){
            Integer temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0){
                evenNumbers.add(temporaryValue);
            }
        }
        System.out.println("Odd numbers' exterminated list  : " + evenNumbers);
        return evenNumbers;
    }
}
