package SOLID.dependecyInversion.observance;

public class SMSNotificationManagerManager implements NotificationManager {
    @Override
    public void triggerNotification() {
        System.out.println("i hope sms has been sent");
    }
}
