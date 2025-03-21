class RegularCustomer extends Customer {
    public RegularCustomer(String name) { 
        super(name); 
    }
    public double calculateDiscount(double amount) { 
        return 0.0; 
    }
}