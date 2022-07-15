package lk.ijse.spring.dto;

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

public class EmployeeDTO {
    @Id
    private String emp_id;
    private String emp_name;
    private String address;
    private String office_id;
    private String salary;
}
