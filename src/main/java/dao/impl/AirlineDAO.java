package dao.impl;

import dao.IAirlineDAO;
import entity.Airline;

import java.util.List;

public class AirlineDAO implements IAirlineDAO {
    private AirportGenericDAO<Airline> airportGenericDAO;

    public AirlineDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Airline>builder()
                .entityType(Airline.class)
                .build();
    }

    @Override
    public List<Airline> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Airline add(Airline newAirline) {
        return airportGenericDAO.add(newAirline);
    }

    @Override
    public boolean delete(Airline rmAirline) {
        return airportGenericDAO.delete(rmAirline);
    }

    @Override
    public Airline get(int airlineID) {
        return airportGenericDAO.get(airlineID);
    }

    @Override
    public void update(Airline updAirline) {
        airportGenericDAO.update(updAirline);
    }
}
