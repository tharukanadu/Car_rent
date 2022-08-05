package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("car")
@CrossOrigin
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCar(){
        return new ResponseUtil(200,"ok",carService.getAllCar());
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCar(@ModelAttribute CarDTO car){
        carService.saveCar(car);
        return new ResponseUtil(200,"Save",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCar(@RequestBody CarDTO car){
        carService.updateCar(car);
        return new ResponseUtil(200,"Save",null);

    }
    @DeleteMapping(params = "{car_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCar(@RequestParam String car_id){
        carService.deleteCar(car_id);
        return new ResponseUtil(200,"Save",null);
    }
    @GetMapping(path = "/{car_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCar(@PathVariable String car_id){
        return new ResponseUtil(200,"Save",carService.searchCar(car_id));

    }
}
