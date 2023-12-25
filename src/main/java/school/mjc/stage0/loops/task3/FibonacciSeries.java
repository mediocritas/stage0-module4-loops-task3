package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int beforeLast = 0;
        int last = 1;
        int sum = 1;
        System.out.println(0);
        for (int i = 0; i < lastFibonacci - 1; i++) {
            System.out.println(sum);
            sum = beforeLast + last;
            beforeLast = last;
            last = sum;
        }
    }
}
