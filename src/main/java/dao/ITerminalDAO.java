package dao;

import entity.Terminal;

import java.util.List;

public interface ITerminalDAO {
    List<Terminal> getAll();
    Terminal add(Terminal newTerminal);
    boolean delete(Terminal rmTerminal);
    Terminal get(int terminalID);
    void update(Terminal updTerminal);
}
