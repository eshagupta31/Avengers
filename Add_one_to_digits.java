public class Add_one_to_digits {
    public static void main(String[] args) {
        
        int five_digit_number = Integer.parseInt(args[0]);
        int One_added_to_all_digits = add_one_to_digits(five_digit_number);
    }

    private static int add_one_to_digits(int five_digit_number) {

        int one_added_to_all_digits = 0;
        String str_five_digit_number = Integer.toString(five_digit_number);
        String str_one_added_to_all_digits = null;
        
        for(int i = 0; i < str_five_digit_number.length(); i++) {
            int i1 = Integer.parseInt(String.valueOf(str_five_digit_number.charAt(i)));

        }

        return one_added_to_all_digits;
    }
}
