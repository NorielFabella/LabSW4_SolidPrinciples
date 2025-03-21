class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("You are paying using Credit Card: $" + amount);
    }
}