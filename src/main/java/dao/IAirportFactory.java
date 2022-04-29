package dao;

import dao.impl.*;
import entity.*;

public interface IAirportFactory {
    AirlineDAO getAirlineDAO();
    AirplaneDAO getAirplaneDAO();
    EmployeeDAO getEmployeeDAO();
    EmpPositionDAO getEmpPositionDAO();
    FlightDAO getFlightDAO();
    PassengerDAO getPassengerDAO();
    IRouteDAO getRouteDAO();
    TicketDAO getTicketDAO();
    TerminalDAO getTerminalDAO();
}
