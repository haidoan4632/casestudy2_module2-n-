package repository;

import model.person.Employee;

public interface IEmployeeRepository {
    void display();

    void add(Employee employee);

    //    void delete ();
    void edit(String code);
}
