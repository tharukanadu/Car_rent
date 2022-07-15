package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class CarDTO {
    @Id
    private String car_id;
    private String car_type;
    private String car_color;
    private double rent_price;
    private String insurance_num;

}
