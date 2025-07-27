public class Task_8 {
    public static void main(String[] args) {
        int result = sumCumulatives(4, 5, 10);
        System.out.println("Total sum of cumulative values: " + result);
    }


    public static int sumCumulatives(int... nums) {
        int total = 0;

        for (int n : nums) {
            int cumulative = (n * (n + 1)) / 2;
            System.out.println(n + " = " + cumulative);
            total += cumulative;
        }

        return total;
    }
}
