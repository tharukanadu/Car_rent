package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("car")
@CrossOrigin
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping
    public List<Car> getAllCar(){
        return carService.getAllCar() ;
    }
    @PostMapping
    public void saveCar(@ModelAttribute Car car){
        carService.saveCar(car);
    }
    @PutMapping
    public void updateCar(@RequestBody Car car){
        carService.updateCar(car);
    }
    @DeleteMapping
    public void deleteCustomer(@RequestParam String car_id){
        carService.deleteCar(car_id);
    }
    @GetMapping(path = "/{car_id}")
    public Car searchCar(@PathVariable String car_id){
        return carService.searchCar(car_id);
    }
}
