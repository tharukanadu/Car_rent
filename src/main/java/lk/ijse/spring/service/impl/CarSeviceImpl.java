package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CarSeviceImpl implements CarService {

    @Autowired
    private CarRepo repo;

    @Override
    public void saveCar(Car entity){
        if (!repo.existsById(entity.getCar_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Car Already Exits..!");
        }
    }
    @Override
    public void deleteCar(String car_id){
        if(repo.existsById(car_id)) {
            repo.deleteById(car_id);
        }else{
            throw new RuntimeException("Please chek the Car Id..! No search car");
        }
    }
    @Override
    public void updateCar(Car entity){
        if(repo.existsById(entity.getCar_id())){
            repo.save(entity);
        }else{
            throw new RuntimeException("No such car to update..!Please chek the Id ");
        }
    }
    @Override
    public Car searchCar(String car_id){
        if (repo.existsById(car_id)) {
            return repo.findById(car_id).get();
        } else {
            throw new RuntimeException("No Car for "+car_id);
        }
    }
    @Override
    public List<Car> getAllCar(){return repo.findAll();}
}
