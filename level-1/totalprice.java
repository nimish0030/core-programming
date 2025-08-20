import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        double total = unitPrice * qty;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + qty + " and unit price is INR " + unitPrice);
    }
}
