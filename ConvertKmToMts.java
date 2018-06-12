public class ConvertKmToMts {
    public static void main(String[] args) {

        int kilometers = Integer.parseInt(args[0]);
        int meters = convertKmToMt(kilometers);
        System.out.print(meters);
    }

    private static int convertKmToMt(int kilometers) {
        return kilometers * 1000;
    }
}
