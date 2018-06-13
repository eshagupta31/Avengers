public class AverageOfDigits {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int average = averageOfDigits(number);
        System.out.print(average);
    }

    private static int averageOfDigits(int number) {
        int sumOfDigits = 0;
        int numberOfDigits = 0;
        int average;
        number = Math.abs(number);

        while (number > 0) {
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
            numberOfDigits++;
        }
        average = sumOfDigits / numberOfDigits;

        return average;
    }
}

