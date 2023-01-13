package edu.home.test;

/**
 * Класс с методами для проверки строки на соответствие условиям ТЗ
 * В случае несоответствия создается объект исключительной ситуации
 *
 * @author Evgeny Gumennikov
 * @version 1.0
 */

public class LineCheck {

    public static String lineCheck(String input) throws IncorrectInputException {
        //удаление пробельных символов из строки
        input = LinePreparing.removeSpaces(input);

        //проверка что строка не пустая
        if (input.isEmpty()) throw new IncorrectInputException("Вы ввели пустую строку");

        //проверка что строка содержит только целочисленные значения
        if (input.contains(".")) throw new IncorrectInputException("Вводите только целые числа");

        //проверка строки на содержание операторов в начале строки
        if (input.startsWith("/") || input.startsWith("-") || input.startsWith("+") || input.startsWith("*"))
            throw new IncorrectInputException("Некорректный ввод операторов и операндов");

        //проверка что строка содержит только допустимые операторы и операнды
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)) && input.charAt(i) != '+' && input.charAt(i) != '-'
                    && input.charAt(i) != '*' && input.charAt(i) != '/')
                throw new IncorrectInputException("Некорректный ввод операторов или операндов");
        }

        //проверка что в строке есть только два операнда и один оператор
        String[] digits = input.split("[/\\-+*]");
        if (digits.length != 2) throw new IncorrectInputException("Некорректный ввод операторов или операндов");

        //проверка операндов на диапазон значений от 1 до 10 включительно
        if (Integer.parseInt(digits[0]) <= 0 || Integer.parseInt(digits[0]) > 10 ||
                Integer.parseInt(digits[1]) <= 0 || Integer.parseInt(digits[1]) > 10)
            throw new IncorrectInputException("некорректные значения операндов");

        return input;
    }
}

