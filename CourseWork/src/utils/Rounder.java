package utils;

public class Rounder {

    public static double roundInputNumber(double inputNumber) {
        inputNumber = inputNumber * 100;
        inputNumber = Math.round(inputNumber);
        inputNumber = inputNumber / 100;
        return inputNumber;
    }
}
