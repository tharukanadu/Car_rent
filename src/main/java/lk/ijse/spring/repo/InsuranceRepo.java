package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepo extends JpaRepository<Insurance,String> {
}
