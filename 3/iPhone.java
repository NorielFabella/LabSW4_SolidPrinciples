class iPhone implements Phone, WebBrowser, Camera {
    public void makeCall(String number) { 
        System.out.println("iPhone calling: " + number); 
    }
    
    public void sendSMS(String number, String msg) { 
        System.out.println("iMessage: " + msg); 
    }
    
    public void browseWeb(String url) { 
        System.out.println("Safari loading: " + url); 
    }
    
    public void takePicture() { 
        System.out.println("iPhone capturing photo"); 
    }
}