import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double areaInch = 0.5 * base * height;
        double areaCm = areaInch * 6.4516; // 1 square inch = 6.4516 sq cm
        System.out.println("Area of triangle is " + areaInch + " sq.inches and " + areaCm + " sq.cm");
    }
}
