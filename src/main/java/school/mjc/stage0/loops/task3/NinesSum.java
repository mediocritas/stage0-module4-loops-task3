package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int last = 1;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum = sum + last;
            last = last * 10 + 1;
        }
        System.out.println(sum * 9);
    }
}
