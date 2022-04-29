package dao;

import java.util.List;

public interface IAirportGenericDAO<T> {
    List<T> getAll();
    T add(T newAirport);
    boolean delete(T rmAirport);
    T get(int airportID);
    void update(T updAirport);
}
