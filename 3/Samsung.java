class Samsung implements Phone, WebBrowser, Camera {
    public void makeCall(String number) { 
        System.out.println("Samsung calling: " + number); 
    }
    
    public void sendSMS(String number, String msg) { 
        System.out.println("Samsung SMS: " + msg); 
    }
    
    public void browseWeb(String url) { 
        System.out.println("Browsing: " + url); 
    }
    
    public void takePicture() { 
        System.out.println("Taking a photo with Samsung");
    }
}