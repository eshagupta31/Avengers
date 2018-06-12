public class ConvertFahrenheitsToCelsius {
    public static void main(String[] args) {

        int fahrenheits = Integer.parseInt(args[0]);
        double celsius = convertFarenToCelsius(fahrenheits);
        System.out.println(celsius);
    }

    private static double convertFarenToCelsius(int fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }
}
