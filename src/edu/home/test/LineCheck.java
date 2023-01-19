package edu.home.test;

/**
 * Класс с методами для проверки строки на соответствие условиям ТЗ
 * В случае несоответствия создается объект исключительной ситуации
 *
 * @author Evgeny Humennikov
 * @version 1.1
 */

class LineCheck {

    static String lineCheck(String input) throws IncorrectInputException {

        //проверка что строка не пустая
        if (input.isEmpty()) throw new IncorrectInputException("Вы ввели пустую строку");

        //проверка что строка содержит только целочисленные значения
        if (input.contains(".")) throw new IncorrectInputException("Вводите только целые числа");

        //проверка что в строке есть только три элемента
        String[] digits = input.split(" ");
        if (digits.length != 3) throw new IncorrectInputException("Некорректный ввод операторов или операндов");

        //проверка строки на содержание операторов и операндов в нужном порядке и значении
        String line = digits[0];
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i)))
                throw new IncorrectInputException("Некорректный ввод операторов или операндов");
        }

        line = digits[2];
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i)))
                throw new IncorrectInputException("Некорректный ввод операторов и операндов");
        }

        //проверка операндов на диапазон значений от 1 до 10 включительно
        if (Integer.parseInt(digits[0]) <= 0 || Integer.parseInt(digits[0]) > 10 ||
                Integer.parseInt(digits[2]) <= 0 || Integer.parseInt(digits[2]) > 10)
            throw new IncorrectInputException("некорректные значения операндов");

        //проверка что строка содержит только допустимые операторы
        line = digits[1];

        if (line.length() != 1) throw new IncorrectInputException("Некорректный ввод оператора");

        char symbol = line.charAt(0);

        if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/')
            throw new IncorrectInputException("Некорректный ввод оператора");

        return input;
    }
}

