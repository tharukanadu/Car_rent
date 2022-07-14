package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Insurance;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.InsuranceRepo;
import lk.ijse.spring.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InsuranceServiceImpl implements InsuranceService {
    @Autowired
    private InsuranceRepo repo;

    @Override
    public void saveInsurance(Insurance entity){
        if (!repo.existsById(entity.getInsurance_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Insurance Already Exits..!");
        }
    }
    @Override
    public void deleteInsurance(String insurance_id){
        if(repo.existsById(insurance_id)) {
            repo.deleteById(insurance_id);
        }else{
            throw new RuntimeException("Please chek the insurance Id..! No search insurance");
        }
    }
    @Override
    public void updateInsurance(Insurance entity){
        if(repo.existsById(entity.getInsurance_id())){
            repo.save(entity);
        }else{
            throw new RuntimeException("No such insurance to update..!Please chek the Id ");
        }
    }
    @Override
    public Insurance searchInsurance(String insurance_id){
        if (repo.existsById(insurance_id)) {
            return repo.findById(insurance_id).get();
        } else {
            throw new RuntimeException("No insurance for "+insurance_id);
        }
    }
    @Override
    public List<Insurance> getAllInsurance(){return repo.findAll();}
}
