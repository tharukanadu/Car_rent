package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private String car_id;
    private String car_type;
    private String car_color;
    private double rent_price;
    private String insurance_num;

    public Car() {
    }

    public Car(String car_id, String car_type, String car_color, double rent_price, String insurance_num) {
        this.car_id = car_id;
        this.car_type = car_type;
        this.car_color = car_color;
        this.rent_price = rent_price;
        this.insurance_num = insurance_num;
    }

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public double getRent_price() {
        return rent_price;
    }

    public void setRent_price(double rent_price) {
        this.rent_price = rent_price;
    }

    public String getInsurance_num() {
        return insurance_num;
    }

    public void setInsurance_num(String insurance_num) {
        this.insurance_num = insurance_num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_id='" + car_id + '\'' +
                ", car_type='" + car_type + '\'' +
                ", car_color='" + car_color + '\'' +
                ", rent_price=" + rent_price +
                ", insurance_num='" + insurance_num + '\'' +
                '}';
    }
}
