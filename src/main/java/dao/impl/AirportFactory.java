package dao.impl;

import dao.IAirportFactory;

public class AirportFactory implements IAirportFactory {

    private static AirlineDAO airlineDAO;
    private static AirplaneDAO airplaneDAO;
    private static EmployeeDAO employeeDAO;
    private static EmpPositionDAO empPositionDAO;
    private static FlightDAO flightDAO;
    private static PassengerDAO passengerDAO;
    private static RouteDAO routeDAO;
    private static TicketDAO ticketDAO;
    private static TerminalDAO terminalDAO;

    @Override
    public AirlineDAO getAirlineDAO() {
        if (airlineDAO == null) {
            airlineDAO = new AirlineDAO();
        }
        return airlineDAO;
    }

    @Override
    public AirplaneDAO getAirplaneDAO() {
        if (airplaneDAO == null) {
            airplaneDAO = new AirplaneDAO();
        }
        return airplaneDAO;
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        if (employeeDAO == null) {
            employeeDAO = new EmployeeDAO();
        }
        return employeeDAO;
    }

    @Override
    public EmpPositionDAO getEmpPositionDAO() {
        if (empPositionDAO == null) {
            empPositionDAO = new EmpPositionDAO();
        }
        return empPositionDAO;
    }

    @Override
    public FlightDAO getFlightDAO() {
        if (flightDAO == null) {
            flightDAO = new FlightDAO();
        }
        return flightDAO;
    }

    @Override
    public PassengerDAO getPassengerDAO() {
        if (passengerDAO == null) {
            passengerDAO = new PassengerDAO();
        }
        return passengerDAO;
    }

    @Override
    public RouteDAO getRouteDAO() {
        if (routeDAO == null) {
            routeDAO = new RouteDAO();
        }
        return routeDAO;
    }

    @Override
    public TicketDAO getTicketDAO() {
        if (ticketDAO == null) {
            ticketDAO = new TicketDAO();
        }
        return ticketDAO;
    }

    @Override
    public TerminalDAO getTerminalDAO() {
        if (terminalDAO == null) {
            terminalDAO = new TerminalDAO();
        }
        return terminalDAO;
    }
}
