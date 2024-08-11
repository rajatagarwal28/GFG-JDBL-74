package Abstract;

public class Main {
    public static void main(String[] args) {
        Customer regCustomer = new RegularCustomer("Regular Customer");
        System.out.println(regCustomer.CalculatePayment(100));
        System.out.println(regCustomer.calculateRewardsPoint(100));
        System.out.println(regCustomer.getName());


        System.out.println("------------------------------");

        Customer goldCustomer = new GoldCustomer("Gold Customer");
        System.out.println(goldCustomer.CalculatePayment(100));
        System.out.println(goldCustomer.calculateRewardsPoint(100));
        System.out.println(goldCustomer.getName());


    }
}
