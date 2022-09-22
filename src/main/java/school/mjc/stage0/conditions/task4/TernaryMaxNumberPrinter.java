package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int a, int b, int c) {
        System.out.println(c > (a > b ? a : b) ? c : ((a > b) ? a : b));
    }
}
