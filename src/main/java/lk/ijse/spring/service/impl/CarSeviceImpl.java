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
    public void deleteCar(String id){repo.deleteById(id);}
    @Override
    public void updateCar(Car entity){repo.save(entity);}
    @Override
    public Car searchCar(String id){return repo.findById(id).get();}
    @Override
    public List<Car> getAllCar(){return repo.findAll();}
}
