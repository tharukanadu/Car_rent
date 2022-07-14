package lk.ijse.spring.controller;

import lk.ijse.spring.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {
  /*  @GetMapping
        public ArrayList<CustomerDTO>getAllCustomer(){
            ArrayList<CustomerDTO> arrayList = new ArrayList<>();
            arrayList.add(new CustomerDTO(1,"Nuwan","Yala","0778442587","male"));
            arrayList.add(new CustomerDTO(2,"Gamini","gampha","0714545478","female"));
            arrayList.add(new CustomerDTO(3,"kamal","kandy","0769982111","male"));
            arrayList.add(new CustomerDTO(4,"Ajitha","panadura","077844247","female"));
            return arrayList;
        }
        @GetMapping(path = "/{id}")
        public CustomerDTO searchCustomer(@PathVariable int id){
        return new CustomerDTO(id,"Lakila","","","");

        }
        @PutMapping(consumes = (MediaType.APPLICATION_JSON_VALUE))
        public CustomerDTO updateCustomer(@RequestBody CustomerDTO dto){
            System.out.println(dto.toString());
            return dto;
        }
        @PostMapping
        public CustomerDTO saveCustomer(@ModelAttribute CustomerDTO dto){
            System.out.println(dto.toString());
            return dto;
        }
        @DeleteMapping(params = {"id"})
        public CustomerDTO deleteCustomer(@RequestParam int id){
        return new CustomerDTO(id,"chamara","galle","0741515151","male");
        }*/
    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer() ;
    }
@PostMapping
    public void saveCustomer(@ModelAttribute Customer customer){
      customerService.saveCustomer(customer);
    }

}