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
public class PaymentDTO {
    @Id
    private String payment;
    private String cus_id;
    private String cont_id;
    private double total_price;
}
