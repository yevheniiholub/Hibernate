package dao.impl;

import dao.IRouteDAO;
import entity.Route;

import java.util.List;

public class RouteDAO implements IRouteDAO {
    AirportGenericDAO<Route> airportGenericDAO;

    public RouteDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Route>builder()
                .entityType(Route.class)
                .build();
    }

    @Override
    public List<Route> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Route add(Route newRoute) {
        return airportGenericDAO.add(newRoute);
    }

    @Override
    public boolean delete(Route rmRoute) {
        return airportGenericDAO.delete(rmRoute);
    }

    @Override
    public Route get(int routeID) {
        return airportGenericDAO.get(routeID);
    }

    @Override
    public void update(Route updRoute) {
        airportGenericDAO.update(updRoute);
    }
}
