package SOLID.dependecyInversion.observance;

public class PurchaseFlowSimulator {
    public static void main(String[] args) {
        PurchaseFlowManager purchaseFlowManager=new PurchaseFlowManager(new Card(), new SMSNotificationManagerManager());
        purchaseFlowManager.triggerPurchaseFlow();
    }
}
