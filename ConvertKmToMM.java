public class ConvertKmToMM{
    public static void main(String[] args) {

        int kilometers = Integer.parseInt(args[0]);
        int miliMeters = convertKmToMM(kilometers);
        System.out.print(miliMeters);
    }

    private static int convertKmToMM(int kilometers) {
        return kilometers * 1000000;
    }
}

