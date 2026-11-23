package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        //get bean by id/name
        //OrderService orderService= (OrderService) context.getBean("orderService");

        //get bean by type
        //OrderService orderService=context.getBean(OrderService.class);

        //OrderService orderService=context.getBean("orderService",OrderService.class);

        //PaymentService paymentService=context.getBean("paymentService",PaymentService.class);

        //orderService.placeOrder();
        //paymentService.pay();
        UserService user=context.getBean(UserService.class);
        context.close();
    }
}