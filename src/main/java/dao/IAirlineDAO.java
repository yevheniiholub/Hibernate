package dao;

import entity.Airline;

import java.util.List;

public interface IAirlineDAO {
    List<Airline> getAll();
    Airline add(Airline newAirline);
    boolean delete(Airline rmAirline);
    Airline get(int airlineID);
    void update(Airline updAirline);
}
