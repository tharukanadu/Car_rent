package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.OfficeDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Office;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.OfficeRepo;
import lk.ijse.spring.service.OfficeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class OfficeServiceImpl implements OfficeService {
    @Autowired
    private OfficeRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveOffice(OfficeDTO dto){
        if (!repo.existsById(dto.getOffice_id())){
            repo.save(mapper.map(dto, Office.class));

        }else {
            throw new RuntimeException("Office Already Exits..!");
        }

    }
    @Override
    public void deleteOffice(String id){repo.deleteById(id);}
    @Override
    public void updateOffice(OfficeDTO dto){
        if(repo.existsById(dto.getOffice_id())){
            repo.save(mapper.map(dto, Office.class));

        }else{
            throw new RuntimeException("No such office to update..!Please chek the Id ");
        }
    }
    @Override
    public OfficeDTO searchOffice(String office_id){
        if (repo.existsById(office_id)) {
            return mapper.map(repo.findById(office_id).get(), OfficeDTO.class);

        } else {
            throw new RuntimeException("No office for "+office_id);
        }
    }
    @Override
    public List<OfficeDTO> getAllOffice(){
        List<Office>all= repo.findAll();
        return mapper.map(all, new TypeToken<List<Office>>() {
        }.getType());

    }
}
