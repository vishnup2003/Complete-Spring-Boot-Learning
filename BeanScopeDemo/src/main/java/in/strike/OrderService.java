package in.strike;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton")      //lazy initialization while singleton is eager initialization
public class OrderService {

    public OrderService(){
        System.out.println("Order Service Created");
    }

    public void placeOrder(){
        System.out.println("Order Placed");
    }

}
