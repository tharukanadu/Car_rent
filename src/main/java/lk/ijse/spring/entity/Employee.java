package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private String emp_id;
    private String emp_name;
    private String address;
    private String office_id;
    private String salary;

    public Employee() {
    }

    public Employee(String emp_id, String emp_name, String address, String office_id, String salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.address = address;
        this.office_id = office_id;
        this.salary = salary;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOffice_id() {
        return office_id;
    }

    public void setOffice_id(String office_id) {
        this.office_id = office_id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id='" + emp_id + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", address='" + address + '\'' +
                ", office_id='" + office_id + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
