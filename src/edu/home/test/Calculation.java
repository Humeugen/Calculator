package edu.home.test;

/**
 * Класс с методами для вычислений арифмет. операций
 *
 * @author Evgeny Gumennikov
 * @version 1.0
 */

public class Calculation {

    //метод для сложения операндов
    public static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //метод для вычитания операндов
    public static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }


    //метод для умножения операндов
    public static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    //метод для деления операндов и приведение результата к целочисленному значению
    public static int division(int firstNumber, int secondNumber) {
        return (int) firstNumber / secondNumber;
    }


}
