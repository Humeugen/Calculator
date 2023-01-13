package edu.home.test;

import java.util.Scanner;

/**
 * Главный класс для запуска программы
 *
 * @author Evgeny Gumennikov
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите арифметическую операцию из двух целых чисел одной строкой.");
        System.out.println("Цифры от 1 до 10 включительно. Например \"2+2\", \"3*4\", \"10 - 5\"...");
        System.out.println("или ex для выхода");
        System.out.print("Ввод строки: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("ex")) {
            System.exit(0);
        }
        scanner.close();

        //проверка введенной строки на соответствие требованиям ТЗ
        try {
            input = LineCheck.lineCheck(input);
        } catch (IncorrectInputException exception) {
            System.out.println(exception.getMyText());
            System.exit(0);
        }

        //проверка строки на наличие операторов из конца строки арифметической операции
        input = LinePreparing.removeExtraMathOperationSymbol(input);

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

        System.out.println(leftNumber + " " + symbol + " " + rightNumber + " = " + result);
    }
}
