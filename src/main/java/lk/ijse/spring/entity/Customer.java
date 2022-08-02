package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Customer {
    @Id
    private String cus_id;
    private String cus_name;
    private String cus_address;
    private String phone_number;
    private String gender;

}
