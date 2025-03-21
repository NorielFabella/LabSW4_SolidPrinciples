class Pet {
    private String petName;
    private String owner;
    
    public Pet(String name, String owner) {
        this.petName = name;
        this.owner = owner;
    }
    
    public String getPetName() { 
        return petName; 
    }
    
    public String getOwner() { 
        return owner; 
    }
}