package dao;

import entity.Flight;

import java.util.List;

public interface IFlightDAO {
    List<Flight> getAll();
    Flight add(Flight newFlight);
    boolean delete(Flight rmFlight);
    Flight get(int flightID);
    void update(Flight updFlight);
}
