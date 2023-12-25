package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String number = Math.abs(t) + "r";
        int copy = Math.abs(t);
        int sum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            sum = sum + copy%10;
            copy = copy/10;
           // System.out.println(sum);
        }

        System.out.println(sum);
    }
}
