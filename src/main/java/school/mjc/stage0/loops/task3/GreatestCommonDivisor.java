package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int divisor = 1;
        if (first != second && first*second !=0) {
            for (int i = 1; i < first; i++) {
                divisor = (first % i == 0 && second % i == 0 ? divisor = i : divisor);
            }
        } else {
            divisor = Math.max(first, second);
        }
        System.out.println(divisor);
    }
}
