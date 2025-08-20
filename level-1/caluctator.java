import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double n2 = sc.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + n1 + " and " + n2 + 
                           " is " + (n1+n2) + ", " + (n1-n2) + ", " + (n1*n2) + ", " + (n1/n2));
    }
}
