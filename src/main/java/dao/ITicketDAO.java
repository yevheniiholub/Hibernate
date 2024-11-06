package dao;

import entity.Ticket;

import java.util.List;

public interface ITicketDAO {
    List<Ticket> getAll();
    Ticket add(Ticket newTicket);
    boolean delete(Ticket rmTicket);
    Ticket get(int ticketID);
    void update(Ticket updTicket);
}
