package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int i = first>second? first : second;
        int b = third>i? third:i;
        System.out.println((i>b)?i:b);
    }
}
