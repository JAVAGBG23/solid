package dependency_inversion;

class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS with message " + message);
    }
}
