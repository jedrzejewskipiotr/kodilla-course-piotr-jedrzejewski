package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers){

        Integer temporaryValue = 0;
        for (Integer n=0; n<numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0){
                evenNumbers.add(temporaryValue);
            }
        }
        System.out.println("Odd numbers' exterminated list  : " + evenNumbers);
    }
}
