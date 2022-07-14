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
    public void deleteInsurance(String id){repo.deleteById(id);}
    @Override
    public void updateInsurance(Insurance entity){repo.save(entity);}
    @Override
    public Insurance searchInsurance(String id){return repo.findById(id).get();}
    @Override
    public List<Insurance> getAllInsurance(){return repo.findAll();}
}
