package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Insurance {
    @Id
    private String insurance_id;
    private String insurance_type;

    public Insurance() {
    }

    public Insurance(String insurance_id, String insurance_type) {
        this.insurance_id = insurance_id;
        this.insurance_type = insurance_type;
    }

    public String getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(String insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insurance_id='" + insurance_id + '\'' +
                ", insurance_type='" + insurance_type + '\'' +
                '}';
    }
}
