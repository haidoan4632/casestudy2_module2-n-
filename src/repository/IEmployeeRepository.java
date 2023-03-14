package repository;

import model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void display();

    void add(Employee employee);

    public List<Employee> getALl();

    //    void delete ();
     void edit(Employee employee);

    Boolean findCode(String code);
}
