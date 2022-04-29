package dao.impl;

import dao.IAirplaneDAO;
import entity.Airplane;

import java.util.List;

public class AirplaneDAO implements IAirplaneDAO {
    AirportGenericDAO<Airplane> airportGenericDAO;

    public AirplaneDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Airplane>builder()
                .entityType(Airplane.class)
                .build();
    }

    @Override
    public List<Airplane> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Airplane add(Airplane newAirplane) {
        return airportGenericDAO.add(newAirplane);
    }

    @Override
    public boolean delete(Airplane rmAirplane) {
        return airportGenericDAO.delete(rmAirplane);
    }

    @Override
    public Airplane get(int airplaneID) {
        return airportGenericDAO.get(airplaneID);
    }

    @Override
    public void update(Airplane updAirplane) {
        airportGenericDAO.update(updAirplane);
    }
}
