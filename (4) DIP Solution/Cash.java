class Cash implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("You are paying in Cash: $" + amount);
    }
}