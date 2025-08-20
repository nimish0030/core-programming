import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km / 1.6;
         System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
