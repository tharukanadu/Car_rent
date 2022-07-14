package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Office;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.OfficeRepo;
import lk.ijse.spring.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class OfficeServiceImpl implements OfficeService {
    @Autowired
    private OfficeRepo repo;

    @Override
    public void saveOffice(Office entity){
        if (!repo.existsById(entity.getOffice_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Office Already Exits..!");
        }

    }
    @Override
    public void deleteOffice(String id){repo.deleteById(id);}
    @Override
    public void updateOffice(Office entity){repo.save(entity);}
    @Override
    public Office searchOffice(String id){return repo.findById(id).get();}
    @Override
    public List<Office> getAllOffice(){return repo.findAll();}
}
