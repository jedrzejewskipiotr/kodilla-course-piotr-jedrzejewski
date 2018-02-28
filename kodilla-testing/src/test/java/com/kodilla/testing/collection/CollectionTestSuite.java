package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

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
    public void dumpTest(){
        Assert.assertTrue(false);
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

        evenNumbersExterminatedList.add(1);

        //Then
        for (Integer list : evenNumbersExterminatedList) {
            Assert.assertTrue(list % 2 == 0);
        }
    }
}









