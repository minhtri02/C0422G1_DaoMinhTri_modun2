package ss8_clear_code.practice;

public class MethodSeparation {

    public static void main(String[] args) {
        System.out.println("Diện tích của hình trụ tròn có radius=3, height=3 là:\n" + getVolume(3, 3));
    }

    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        return perimeter * height + 2 * baseArea;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
