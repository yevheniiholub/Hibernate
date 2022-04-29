package dao.impl;

import dao.IPassengerDAO;
import entity.Passenger;

import java.util.List;

public class PassengerDAO implements IPassengerDAO {
    AirportGenericDAO<Passenger> airportGenericDAO;

    public PassengerDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Passenger>builder()
                .entityType(Passenger.class)
                .build();
    }

    @Override
    public List<Passenger> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Passenger add(Passenger newPassenger) {
        return airportGenericDAO.add(newPassenger);
    }

    @Override
    public boolean delete(Passenger rmPassenger) {
        return airportGenericDAO.delete(rmPassenger);
    }

    @Override
    public Passenger get(int passengerID) {
        return airportGenericDAO.get(passengerID);
    }

    @Override
    public void update(Passenger updPassenger) {
        airportGenericDAO.update(updPassenger);    }
}
