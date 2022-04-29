package dao.impl;

import dao.IEmployeeDAO;
import entity.Employee;

import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {
    AirportGenericDAO<Employee> airportGenericDAO;

    public EmployeeDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Employee>builder()
                .entityType(Employee.class)
                .build();
    }

    @Override
    public List<Employee> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Employee add(Employee newEmployee) {
        return airportGenericDAO.add(newEmployee);
    }

    @Override
    public boolean delete(Employee rmEmployee) {
        return airportGenericDAO.delete(rmEmployee);
    }

    @Override
    public Employee get(int employeeID) {
        return airportGenericDAO.get(employeeID);
    }

    @Override
    public void update(Employee updEmployee) {
        airportGenericDAO.update(updEmployee);
    }
}
