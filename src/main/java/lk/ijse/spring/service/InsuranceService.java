package lk.ijse.spring.service;

import lk.ijse.spring.entity.Insurance;

import java.util.List;

public interface InsuranceService {
    public void saveInsurance(Insurance entity);
    public void deleteInsurance(String id);
    public void updateInsurance(Insurance entity);
    public Insurance searchInsurance(String id);
    public List<Insurance> getAllInsurance();
}
