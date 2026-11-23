package in.vishnu;

import in.vishnu.Notifications.EmailService;
import in.vishnu.Notifications.NotificationService;
import in.vishnu.Notifications.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification=new EmailService();
        OrderService order=new OrderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}