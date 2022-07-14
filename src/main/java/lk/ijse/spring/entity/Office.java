package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Office {
    @Id
    private String office_id;
    private String office_name;
    private String office_address;
    private String office_manager;


    public Office() {
    }

    public Office(String office_id, String office_address, String office_manager, String office_name) {
        this.office_id = office_id;
        this.office_address = office_address;
        this.office_manager = office_manager;
        this.office_name = office_name;
    }

    public String getOffice_id() {
        return office_id;
    }

    public void setOffice_id(String office_id) {
        this.office_id = office_id;
    }

    public String getOffice_address() {
        return office_address;
    }

    public void setOffice_address(String office_address) {
        this.office_address = office_address;
    }

    public String getOffice_manager() {
        return office_manager;
    }

    public void setOffice_manager(String office_manager) {
        this.office_manager = office_manager;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    @Override
    public String toString() {
        return "Office{" +
                "office_id='" + office_id + '\'' +
                ", office_address='" + office_address + '\'' +
                ", office_manager='" + office_manager + '\'' +
                ", office_name='" + office_name + '\'' +
                '}';
    }
}
