package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatCalcServiceTest {
    @Test
    void CalculatorTestTotal() {
        StatCalcService calculator = new StatCalcService();

        long[] inputArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 180;
        int actual = (int)calculator.calcTotal(inputArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculatorTestAverage() {
        StatCalcService calculator = new StatCalcService();

        long[] inputArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 15;
        long actual = calculator.calcAverage(inputArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculatorTestMinMonth() {
        StatCalcService calculator = new StatCalcService();

        long[] inputArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 9;
        int actual = calculator.minSales(inputArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculatorTestMaxMonth() {
        StatCalcService calculator = new StatCalcService();

        long[] inputArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 8;
        int actual = calculator.maxSales(inputArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculatorTestDoinks() {
        StatCalcService calculator = new StatCalcService();

        long[] inputArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = calculator.calcUnstonks(inputArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculatorTestStonks() {
        StatCalcService calculator = new StatCalcService();

        long[] inputArray = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 5;
        long actual = calculator.calcStonks(inputArray);

        Assertions.assertEquals(expected, actual);
    }
}
