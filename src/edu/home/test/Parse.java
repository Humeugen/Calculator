package edu.home.test;

/**
 * Класс с методами для определения оператора и парсинга операндов арифм. операции
 *
 * @author Evgeny Humennikov
 * @version 1.0
 */

class Parse {
    //определение оператора арифметической операции
    static char findMathSymbol(String input) {

        char symbol = 0;
        input = input.replaceAll(" ", "");
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                symbol = input.charAt(i);
            }
        }
        return symbol;
    }

    //получение левого операнда
    static int getLeftNumber(String input) {
        String[] line = input.split(" ");
        return Integer.parseInt(line[0]);
    }

    //получение правого операнда
    static int getRightNumber(String input) {
        String[] line = input.split(" ");
        return Integer.parseInt(line[2]);
    }
}
