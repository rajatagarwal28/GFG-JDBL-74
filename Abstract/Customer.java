package Abstract;

abstract  class Customer {
    private String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    abstract double CalculatePayment(int price);

    abstract double calculateRewardsPoint(int price);

    public String getName() {
        return customerName;
    }

}
