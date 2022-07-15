package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.InsuranceDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Insurance;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.InsuranceRepo;
import lk.ijse.spring.service.InsuranceService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class InsuranceServiceImpl implements InsuranceService {
    @Autowired
    private InsuranceRepo repo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveInsurance(InsuranceDTO dto
    ){
        if (!repo.existsById(dto.getInsurance_id())){
            repo.save(mapper.map(dto, Insurance.class));

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
    public void updateInsurance(InsuranceDTO dto){
        if(repo.existsById(dto.getInsurance_id())){
            repo.save(mapper.map(dto, Insurance.class));

        }else{
            throw new RuntimeException("No such insurance to update..!Please chek the Id ");
        }
    }
    @Override
    public InsuranceDTO searchInsurance(String insurance_id){
        if (repo.existsById(insurance_id)) {
            return mapper.map(repo.findById(insurance_id).get(), InsuranceDTO.class);

        } else {
            throw new RuntimeException("No insurance for "+insurance_id);
        }
    }
    @Override
    public List<InsuranceDTO> getAllInsurance(){
        List<Insurance>all= repo.findAll();

        return mapper.map(all, new TypeToken<List<Insurance>>() {
        }.getType());

    }
}
