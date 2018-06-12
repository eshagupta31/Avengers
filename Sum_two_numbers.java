public class Sum_two_numbers {

        public static void main(String[] args) {

            int first_number = Integer.parseInt(args[0]);
            int second_number = Integer.parseInt(args[1]);

            int sum = add_two_numbers(first_number, second_number);
            System.out.println(sum);
        }

    private static int add_two_numbers(int first_number, int second_number) {

            return first_number + second_number;
    }



}

