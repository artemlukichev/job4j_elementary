package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (!name.isEmpty()
                && !isSpecialSymbol(name.codePointAt(0))
                && !isUpperLatinLetter(name.codePointAt(0))
                && isLowerLatinLetter(name.codePointAt(0))) {
            return true;
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 24 || code == 5) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }
}