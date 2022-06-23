package pe.edu.pe.bytebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.bytebackend.model.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
}
