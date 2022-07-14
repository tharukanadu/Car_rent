package lk.ijse.spring.service;

import lk.ijse.spring.entity.Payment;

import java.util.List;

public interface PaymentService {
    public void savePayment(Payment entity);
    public void deletePayment(String id);
    public void updatePayment(Payment entity);
    public Payment searchPayment(String id);
    public List<Payment> getAllPayment();
}
