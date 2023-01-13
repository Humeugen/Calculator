package edu.home.test;

/**
 * Класс с методами для подготовки строки арифметич. операции к проверке на условия ТЗ
 * (удаление ппробельных символов и оператора в конце строки)
 *
 * @author Evgeny Gumennikov
 * @version 1.0
 */

public class LinePreparing {

    //удаление пробельных символов из введенной пользователем строки
    public static String removeSpaces(String input) {
        return input.contains(" ") ? input.replaceAll(" ", "") : input;
    }

    //удаление операторов из конца введенной строки
    public static String removeExtraMathOperationSymbol(String input) {
        return (input.endsWith("-") || input.endsWith("+") || input.endsWith("/") || input.endsWith("*")) ?
                input.substring(0, input.length() - 1) : input;
    }
}
