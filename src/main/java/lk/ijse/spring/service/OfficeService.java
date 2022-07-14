package lk.ijse.spring.service;

import lk.ijse.spring.entity.Office;

import java.util.List;

public interface OfficeService {
    public void saveOffice(Office entity);
    public void deleteOffice(String id);
    public void updateOffice(Office entity);
    public Office searchOffice(String id);
    public List<Office> getAllOffice();
}
