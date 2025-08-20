public class Main{
    public static void main(String[] args) {
        int fees =125000;
        int disper= 10; //discoutn percentage 10%
        double discount=(fees*disper)/100.0;
        double finalfees=fees-discount;
         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfees);
    }
}
