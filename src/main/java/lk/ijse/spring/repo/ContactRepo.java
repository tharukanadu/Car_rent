package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,String> {
}
