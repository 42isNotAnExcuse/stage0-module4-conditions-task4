package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int theOne;

        if (first >= second && first >= third) {
            theOne = first;
        } else if (second >= first && second >= third) {
            theOne = second;
        } else {
            theOne = third;
        }
        System.out.println(theOne);
    }
}
