package Abstract;

public class RegularCustomer extends Customer{
    RegularCustomer(String name) {
       super(name);
    }

    double CalculatePayment(int price) {
        return 0.9*price;
    }

    @Override
    double calculateRewardsPoint(int price) {
        return 0.1*price;
    }

    Override
    public String getName() {
        return "customerName";
    }

}
