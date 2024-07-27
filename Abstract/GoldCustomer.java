package Abstract;

public class GoldCustomer extends Customer {

    GoldCustomer(String name) {
        super(name);
    }
    double CalculatePayment(int price) {
        return 0.8*price;
    }

    @Override
    double calculateRewardsPoint(int price) {
        return 0.2*price;
    }

}
