package SOLID.dependecyInversion.observance;
/*
* So here in dependency Inversion principle
* 1) higher level module should always abstracted with lower module and vise versa
* 2) second we are providing access to client to choose wht so ever they want to choose payment method and also notification way*/

public class PurchaseFlowManager {
   private final NotificationManager notificationManger;
   private final PaymentProcessor paymentProcessor;

    public PurchaseFlowManager(PaymentProcessor paymentProcessor, NotificationManager notificationManger) {
        this.notificationManger = notificationManger;
        this.paymentProcessor = paymentProcessor;
    }

   public void triggerPurchaseFlow(){
        paymentProcessor.payment();
        notificationManger.triggerNotification();
   }
}
