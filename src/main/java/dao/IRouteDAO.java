package dao;

import entity.Route;

import java.util.List;

public interface IRouteDAO {
    List<Route> getAll();
    Route add(Route newRoute);
    boolean delete(Route rmRoute);
    Route get(int routeID);
    void update(Route updRoute);
}
