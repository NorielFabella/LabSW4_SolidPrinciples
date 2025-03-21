class SeniorCitizenCustomer extends Customer {
    public SeniorCitizenCustomer(String name) { 
        super(name); 
    }
    public double calculateDiscount(double amount) {
         return amount * 0.10; 
        }
}