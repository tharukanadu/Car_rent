package lk.ijse.spring.service;

import lk.ijse.spring.dto.InsuranceDTO;
import lk.ijse.spring.entity.Insurance;

import java.util.List;

public interface InsuranceService {
    public void saveInsurance(InsuranceDTO dto);
    public void deleteInsurance(String id);
    public void updateInsurance(InsuranceDTO dto);
    public InsuranceDTO searchInsurance(String id);
    public List<InsuranceDTO> getAllInsurance();
}
