package dao.impl;

import dao.IEmpPositionDAO;
import entity.EmpPosition;

import java.util.List;

public class EmpPositionDAO implements IEmpPositionDAO {
    AirportGenericDAO<EmpPosition> airportGenericDAO;

    public EmpPositionDAO() {
        this.airportGenericDAO = AirportGenericDAO.<EmpPosition>builder()
                .entityType(EmpPosition.class)
                .build();
    }

    @Override
    public List<EmpPosition> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public EmpPosition add(EmpPosition newEmpPosition) {
        return airportGenericDAO.add(newEmpPosition);
    }

    @Override
    public boolean delete(EmpPosition rmEmpPosition) {
        return airportGenericDAO.delete(rmEmpPosition);
    }

    @Override
    public EmpPosition get(int empPositionID) {
        return airportGenericDAO.get(empPositionID);
    }

    @Override
    public void update(EmpPosition updEmpPosition) {
        airportGenericDAO.update(updEmpPosition);
    }
}
