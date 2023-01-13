package edu.home.test;

/**
 * Класс с методами для определения оператора и парсинга операндов арифм. операции
 *
 * @author Evgeny Gumennikov
 * @version 1.0
 */

public class Parse {

    //определение оператора арифметической операции
    public static char findMathSymbol(String input) {
        char symbol = 0;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                symbol = input.charAt(i);
            }
        }
        return symbol;
    }

     //получение левого операнда
    public static int getLeftNumber(String input) {
        int position = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                position = input.indexOf(input.charAt(i));
            }
        }
        return Integer.parseInt(input.substring(0, position));
    }

    //получение правого операнда
    public static int getRightNumber(String input) {
        int position = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                position = input.indexOf(input.charAt(i));
            }
        }
        return Integer.parseInt(input.substring(position + 1));
    }
}
