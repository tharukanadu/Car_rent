package lk.ijse.spring.service;

import lk.ijse.spring.dto.OfficeDTO;
import lk.ijse.spring.entity.Office;

import java.util.List;

public interface OfficeService {
    public void saveOffice(OfficeDTO dto);
    public void deleteOffice(String id);
    public void updateOffice(OfficeDTO dto);
    public OfficeDTO searchOffice(String id);
    public List<OfficeDTO> getAllOffice();
}
