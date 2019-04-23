package com.kodilla.testing;

import com.kodilla.testing.collection.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestingMain {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<Integer>();
        Random generator = new Random();

        for(int i=0; i<100; i++){
            numbers.add(generator.nextInt(50)+1);
        }
        System.out.println("Generated random numbers list : " + numbers);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);


    }
}