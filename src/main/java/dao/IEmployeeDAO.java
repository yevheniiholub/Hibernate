package dao;

import entity.Employee;

import java.util.List;

public interface  IEmployeeDAO {
    List<Employee> getAll();
    Employee add(Employee newEmployee);
    boolean delete(Employee rmEmployee);
    Employee get(int employeeID);
    void update(Employee updEmployee);
}
