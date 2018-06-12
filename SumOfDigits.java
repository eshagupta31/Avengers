public class SumOfDigits {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int sum = sumOfDigits(number);
        System.out.print(sum);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;

        while(number % 10 > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

}
