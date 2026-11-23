package in.strikes.transactionDemo2.repository;

import in.strikes.transactionDemo2.entity.PaymentAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAuditRepository extends JpaRepository<PaymentAudit,Long> {
}
