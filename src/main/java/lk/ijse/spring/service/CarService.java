package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;

import java.util.List;

public interface CarService {
    public void saveCar(CarDTO dto);
    public void deleteCar(String id);
    public void updateCar(CarDTO dto);
    public CarDTO searchCar(String id);
    public List<CarDTO> getAllCar();
}
