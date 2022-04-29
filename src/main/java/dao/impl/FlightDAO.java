package dao.impl;

import dao.IFlightDAO;
import entity.Flight;

import java.util.List;

public class FlightDAO implements IFlightDAO {
    AirportGenericDAO<Flight> airportGenericDAO;

    public FlightDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Flight>builder()
                .entityType(Flight.class)
                .build();
    }

    @Override
    public List<Flight> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Flight add(Flight newFlight) {
        return airportGenericDAO.add(newFlight);
    }

    @Override
    public boolean delete(Flight rmFlight) {
        return airportGenericDAO.delete(rmFlight);
    }

    @Override
    public Flight get(int flightID) {
        return airportGenericDAO.get(flightID);
    }

    @Override
    public void update(Flight updFlight) {
        airportGenericDAO.update(updFlight);
    }
}
