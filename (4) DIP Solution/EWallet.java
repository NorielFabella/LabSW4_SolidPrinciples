class EWallet implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("You are paying in GCash: $" + amount);
    }
}