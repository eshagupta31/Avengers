public class CircumferenceOfCircle {

    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double circumference = circumferenceOfCircle(radius);
        System.out.print(circumference);
    }

    private static double circumferenceOfCircle(double radius) {
        return (2 * Math.PI * radius);
    }
}
