package in.strikes.transactionDemo2.service;

import in.strikes.transactionDemo2.entity.Order;
import in.strikes.transactionDemo2.repository.OrderRepository;
import in.strikes.transactionDemo2.repository.PaymentAuditRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private PaymentAuditService paymentAuditService;

    public OrderService(OrderRepository orderRepository,PaymentAuditService paymentAuditService){
        this.orderRepository=orderRepository;
        this.paymentAuditService=paymentAuditService;
    }

    @Transactional
    public void placeOrder(Order order){
        orderRepository.save(order);
        paymentAuditService.audit(order);
    }
}
