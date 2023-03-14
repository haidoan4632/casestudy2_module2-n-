package repository;

import model.person.Customer;
import model.person.Employee;

import java.util.List;

public interface ICustomerRepository {
    void display();

    void add(Customer customer);

    public List<Customer> getALl();

    //    void delete ();
    void edit(Customer customer);

    Boolean findCode(String code);
}
