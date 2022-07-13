package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepo extends JpaRepository<Office,String> {
}
