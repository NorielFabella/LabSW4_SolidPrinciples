class BasicPhone implements Phone {
    public void makeCall(String number) {
         System.out.println("Calling: " + number);
         }
         
    public void sendSMS(String number, String msg) { 
        System.out.println("SMS to " + number + ": " + msg); 
    }
}