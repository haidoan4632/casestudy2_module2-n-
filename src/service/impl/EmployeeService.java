package service.impl;

import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        employeeRepository.display();
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }
}
