import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
		System.out.print("Enter Discount %: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
                System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
