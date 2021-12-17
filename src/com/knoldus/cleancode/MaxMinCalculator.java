package com.knoldus.cleancode;

public class MaxMinCalculator {
    static class MaxMinNumber {

        int minNumber;
        int maxNumber;
    }

    //Method to calculate minimum and maximum number from the given array
    static MaxMinNumber maxMinCalculator(int[] numbers, int size) {
        MaxMinNumber maxMinNumber = new MaxMinNumber();
        int counter;

        //Maximum and Minimum number will be same for a single element i.e. when array length is 1
        if (size == 1) {
            maxMinNumber.maxNumber = numbers[0];
            maxMinNumber.minNumber = numbers[0];
            return maxMinNumber;
        }

        //Setting greater of the first 2 numbers as maximum and the other as minimum
        if (numbers[0] > numbers[1]) {
            maxMinNumber.maxNumber = (numbers[0]);
            maxMinNumber.minNumber = (numbers[1]);
        } else {
            maxMinNumber.maxNumber = (numbers[1]);
            maxMinNumber.minNumber = (numbers[0]);
        }

        //Iterating the array to compare and check minimum and maximum number
        for (counter = 2; counter < size; counter++) {
            if (numbers[counter] > maxMinNumber.maxNumber) {
                maxMinNumber.maxNumber = numbers[counter];
            } else if (numbers[counter] < maxMinNumber.minNumber) {
                maxMinNumber.minNumber = numbers[counter];
            }
        }

        return maxMinNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1000, 11, 445, 1, 330, 3000};
        int size = 6;
        MaxMinNumber calculator = maxMinCalculator(numbers, size);
        System.out.printf("\nMinimum Number in the array is %d", calculator.minNumber);
        System.out.printf("\nMaximum Number in the array is %d", calculator.maxNumber);
    }
}
