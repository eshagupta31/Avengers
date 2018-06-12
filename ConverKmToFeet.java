public class ConverKmToFeet {
        public static void main(String[] args) {

            int kilometers = Integer.parseInt(args[0]);
            double feet = convertKmToFeet(kilometers);
            System.out.print(feet);
        }

        private static double convertKmToFeet(int kilometers) {
            return kilometers * 13280.84;
        }
    }
