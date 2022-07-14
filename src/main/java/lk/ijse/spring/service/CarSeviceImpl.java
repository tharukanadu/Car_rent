package lk.ijse.spring.service;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CarSeviceImpl {

    @Autowired
    private CarRepo repo;

    public void saveCar(Car entity){
        if (!repo.existsById(entity.getCar_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Car Already Exits..!");
        }
    }
    public void deleteCar(String id){repo.deleteById(id);}
    public void updateCar(Car entity){repo.save(entity);}
    public Car searchCar(String id){return repo.findById(id).get();}
    public List<Car> getAllCar(){return repo.findAll();}
}
