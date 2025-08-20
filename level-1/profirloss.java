public class Main{
    public static void main(String[] args) {
        int cost =129;
        int selling = 191;
        int profit = selling - cost;
        double profitpercent = (profit*100.0)/cost;
         System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + selling + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitpercent);
    }
}
