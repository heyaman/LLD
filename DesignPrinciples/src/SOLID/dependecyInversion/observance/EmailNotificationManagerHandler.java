package SOLID.dependecyInversion.observance;

public class EmailNotificationManagerHandler implements NotificationManager {
    @Override
    public void triggerNotification() {
        System.out.println("I hope Email has been sent successfully");
    }
}
