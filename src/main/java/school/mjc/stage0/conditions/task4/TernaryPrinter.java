package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        int result = first>second ? first : second;
        int di = result>10 ? result:-10;
        System.out.println(di);
    }
}
