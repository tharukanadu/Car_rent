package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity

public class Contact {
    @Id
    private String cont_id;
    private String cus_id;
    private String office_id;
    private Date end_date;
    private Date start_date;
    private String car_num;

}
