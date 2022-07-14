package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CarSeviceImpl;
import lk.ijse.spring.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("car")
@CrossOrigin
public class CarController {
    @Autowired
    CarSeviceImpl carSevice;

    @GetMapping
    public List<Car> getAllCar(){
        return carSevice.getAllCar() ;
    }
    @PostMapping
    public void saveCar(@ModelAttribute Car car){
        carSevice.saveCar(car);
    }

}
