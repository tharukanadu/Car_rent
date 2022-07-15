package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class CarSeviceImpl implements CarService {

    @Autowired
    private CarRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCar(CarDTO dto){
        if (!repo.existsById(dto.getCar_id())){
            repo.save(mapper.map(dto, Car.class));
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
    public void updateCar(CarDTO dto){
        if(repo.existsById(dto.getCar_id())){
            repo.save(mapper.map(dto, Car.class));
        }else{
            throw new RuntimeException("No such car to update..!Please chek the Id ");
        }
    }
    @Override
    public CarDTO searchCar(String car_id){
        if (repo.existsById(car_id)) {
            return mapper.map(repo.findById(car_id).get(), CarDTO.class);
        } else {
            throw new RuntimeException("No Car for "+car_id);
        }
    }
    @Override
    public List<CarDTO> getAllCar(){
        List<Car>all= repo.findAll();

        return mapper.map(all, new TypeToken<List<Car>>() {
        }.getType());
    }
}
