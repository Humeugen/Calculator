package edu.home.test;

import java.util.Scanner;

/**
 * Главный класс для запуска программы
 *
 * @author Evgeny Humennikov
 * @version 1.1
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите арифметическую операцию из двух целых чисел одной строкой.");
        System.out.println("Цифры от 1 до 10 включительно (через пробел). Например \"2 + 2\", \"10 * 5\"");
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

        System.out.println("результат: " + Calculator.calc(input));
    }
}
