package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    private OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void before() {
        System.out.println("Odd numbers exterminator test case : start");
    }

    @After
    public void after() {
        System.out.println("Odd numbers exterminator test case : stop");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Odd numbers exterminator test suit started");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Odd numbers exterminator test suit ended");
    }

    @Test
    public void oddNumberExterminator() {

        //Given
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(integers);

        //Then
        for (Integer integer : evenNumbers) {
            Assert.assertTrue(integer % 2 == 0);
        }
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given

        ArrayList<Integer> newNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbersExterminatedList = new ArrayList<Integer>();
        //When
        Integer temporaryValue = 0;
        for (Integer n = 0; n < newNumbers.size(); n++) {
            temporaryValue = newNumbers.get(n);
            if (temporaryValue % 2 == 0) {
                evenNumbersExterminatedList.add(temporaryValue);
            }
        }
        //Then
        if (newNumbers.isEmpty()) {
            System.out.println("Test error : list is empty");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbersExterminatedList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        //When
        Integer temporaryValue = 0;
        for (Integer n = 0; n < numbers.size(); n++) {
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0) {
                evenNumbersExterminatedList.add(temporaryValue);
            }
        }
        //Then
        for (Integer list : evenNumbersExterminatedList) {
            if (list % 2 != 0) {
                System.out.println("Test error");
            }
        }
    }
}









