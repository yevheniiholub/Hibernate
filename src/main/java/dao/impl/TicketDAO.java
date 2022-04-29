package dao.impl;

import dao.ITicketDAO;
import entity.Ticket;

import java.util.List;

public class TicketDAO implements ITicketDAO {
    AirportGenericDAO<Ticket> airportGenericDAO;

    public TicketDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Ticket>builder()
                .entityType(Ticket.class)
                .build();
    }

    @Override
    public List<Ticket> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Ticket add(Ticket newTicket) {
        return airportGenericDAO.add(newTicket);
    }

    @Override
    public boolean delete(Ticket rmTicket) {
        return airportGenericDAO.delete(rmTicket);
    }

    @Override
    public Ticket get(int ticketID) {
        return airportGenericDAO.get(ticketID);
    }

    @Override
    public void update(Ticket updTicket) {
        airportGenericDAO.update(updTicket);
    }
}
