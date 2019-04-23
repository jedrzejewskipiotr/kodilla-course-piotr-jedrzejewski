package com.kodilla.testing.collection;

import org.junit.*;

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
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        List<Integer> evenNumbersExterminatedList = new ArrayList<Integer>();

        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(evenNumbersExterminatedList);

        //Then
        Assert.assertTrue(evenNumbers.isEmpty());
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        //When
        List<Integer> newNumbers = oddNumbersExterminator.exterminate(numbers);

        //Then
        for (Integer normalList : newNumbers) {
            Assert.assertTrue(normalList % 2 == 0);
        }
    }
}











