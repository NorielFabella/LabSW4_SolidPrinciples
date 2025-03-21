public interface Phone {
    void makeCall(String number);
    void sendSMS(String number, String message);
}

public interface WebBrowser {
    void browseWeb(String url);
}

public interface Camera {
    void takePicture();
}