package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            } else if (isBishop(x1, y1, x2, y2)) {
                rsl = (int) Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) / 2);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isBishop(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }
}
