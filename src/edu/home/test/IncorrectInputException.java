package edu.home.test;

/**
 * Класс для создания собственной исключительной ситуации
 *
 * @author Evgeny Gumennikov
 * @version 1.0
 */

public class IncorrectInputException extends RuntimeException {
    String myText;

    public IncorrectInputException(String myText) {
        this.myText = myText;
    }

    public String getMyText() {
        return myText;
    }
}
