package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl2 = y2 - y1;
        double first = Math.pow(rsl, 2);
        double second = Math.pow(rsl2, 2);
        double sum = first + second;
        double res = Math.sqrt(Math.pow(rsl) + Math.pow(rsl2));
        return res;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 5, 6, 10);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
