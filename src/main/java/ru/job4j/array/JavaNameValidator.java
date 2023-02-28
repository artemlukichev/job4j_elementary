package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rls = false;
        if (name.length() != 0) {
        for (int i = 0; i < name.length(); i++) {
            if ((i == 0 && (isSpecialSymbol(name.codePointAt(i)) || isUpperLatinLetter(name.codePointAt(i)) || !isLowerLatinLetter(name.codePointAt(i))))
                     || (i != 0 && (!isSpecialSymbol(name.codePointAt(i)) && !isUpperLatinLetter(name.codePointAt(i)) && !isLowerLatinLetter(name.codePointAt(i)) && !Character.isDigit(name.codePointAt(i))))) {
                 rls = false;
                 break;
            } else {
                 rls = true;
             }
         }
        }
        return rls;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}