package edu.home.test;

/**
 * Класс содержащий метод выбора арифметической операции в зависимости от оператора
 *
 * @author Evgeny Humennikov
 * version 1.0
 */

class Calculator {

    static String calc(String input) {
        //определение оператора математической операции и парсинг операндов
        char symbol = Parse.findMathSymbol(input);
        int leftNumber = Parse.getLeftNumber(input);
        int rightNumber = Parse.getRightNumber(input);
        //инициализация переменной для полученного результата вычисления арифметической операции
        int result = 0;

        switch (symbol) {
            case '*':
                result = Calculation.multiplication(leftNumber, rightNumber);
                break;
            case '/':
                result = Calculation.division(leftNumber, rightNumber);
                break;
            case '+':
                result = Calculation.addition(leftNumber, rightNumber);
                break;
            case '-':
                result = Calculation.subtraction(leftNumber, rightNumber);

        }
        return Integer.toString(result);
    }
}
