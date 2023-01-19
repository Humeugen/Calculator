package edu.home.test;

/**
 * Класс для создания собственной исключительной ситуации
 *
 * @author Evgeny Humennikov
 * @version 1.0
 */

class IncorrectInputException extends RuntimeException {
    String myText;

    IncorrectInputException(String myText) {
        this.myText = myText;
    }

    String getMyText() {
        return myText;
    }
}
