package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Contact {
    @Id
    private String cont_id;
    private String cus_id;
    private String office_id;
    private Date end_date;
    private Date start_date;
    private String car_num;

    public Contact() {
    }

    public Contact(String cont_id, String cus_id, String office_id, Date end_date, Date start_date, String car_num) {
        this.cont_id = cont_id;
        this.cus_id = cus_id;
        this.office_id = office_id;
        this.end_date = end_date;
        this.start_date = start_date;
        this.car_num = car_num;
    }

    public String getCont_id() {
        return cont_id;
    }

    public void setCont_id(String cont_id) {
        this.cont_id = cont_id;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getOffice_id() {
        return office_id;
    }

    public void setOffice_id(String office_id) {
        this.office_id = office_id;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getCar_num() {
        return car_num;
    }

    public void setCar_num(String car_num) {
        this.car_num = car_num;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cont_id='" + cont_id + '\'' +
                ", cus_id='" + cus_id + '\'' +
                ", office_id='" + office_id + '\'' +
                ", end_date=" + end_date +
                ", start_date=" + start_date +
                ", car_num='" + car_num + '\'' +
                '}';
    }
}
