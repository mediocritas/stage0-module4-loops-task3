package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        int smaller = Math.min(firstBoarder, secondBoarder);
        int bigger = Math.max(firstBoarder, secondBoarder);
        /*for (int i = 0; i < Math.abs(firstBoarder - secondBoarder); i++) {
            sum = sum + smaller + i;
        }*/
        System.out.println((Math.abs(firstBoarder - secondBoarder)+1)*(bigger + smaller)/2);
    }
}
