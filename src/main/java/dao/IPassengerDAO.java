package dao;

import entity.Passenger;

import java.util.List;

public interface IPassengerDAO {
    List<Passenger> getAll();
    Passenger add(Passenger newPassenger);
    boolean delete(Passenger rmPassenger);
    Passenger get(int passengerID);
    void update(Passenger updPassenger);
}
