package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    private String payment;
    private String cus_id;
    private String cont_id;
    private double total_price;

    public Payment() {
    }

    public Payment(String cus_id, String cont_id, String payment, double total_price) {
        this.cus_id = cus_id;
        this.cont_id = cont_id;
        this.payment = payment;
        this.total_price = total_price;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getCont_id() {
        return cont_id;
    }

    public void setCont_id(String cont_id) {
        this.cont_id = cont_id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cus_id='" + cus_id + '\'' +
                ", cont_id='" + cont_id + '\'' +
                ", payment='" + payment + '\'' +
                ", total_price=" + total_price +
                '}';
    }
}
