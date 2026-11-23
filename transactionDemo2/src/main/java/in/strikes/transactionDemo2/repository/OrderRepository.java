package in.strikes.transactionDemo2.repository;

import in.strikes.transactionDemo2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
