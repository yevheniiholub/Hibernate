package dao.impl;

import dao.ITerminalDAO;
import entity.Terminal;

import java.util.List;

public class TerminalDAO implements ITerminalDAO {
    AirportGenericDAO<Terminal> airportGenericDAO;

    public TerminalDAO() {
        this.airportGenericDAO = AirportGenericDAO.<Terminal>builder()
                .entityType(Terminal.class)
                .build();
    }

    @Override
    public List<Terminal> getAll() {
        return airportGenericDAO.getAll();
    }

    @Override
    public Terminal add(Terminal newTerminal) {
        return airportGenericDAO.add(newTerminal);
    }

    @Override
    public boolean delete(Terminal rmTerminal) {
        return airportGenericDAO.delete(rmTerminal);
    }

    @Override
    public Terminal get(int terminalID) {
        return airportGenericDAO.get(terminalID);
    }

    @Override
    public void update(Terminal updTerminal) {
        airportGenericDAO.update(updTerminal);
    }
}
