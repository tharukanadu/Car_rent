package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String cus_id;
    private String cus_name;
    private String cus_address;
    private String phone_number;
    private String gender;


}
