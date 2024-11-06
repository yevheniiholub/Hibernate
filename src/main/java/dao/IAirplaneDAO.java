package dao;

import entity.Airplane;

import java.util.List;

public interface IAirplaneDAO {
    List<Airplane> getAll();
    Airplane add(Airplane newAirplane);
    boolean delete(Airplane rmAirplane);
    Airplane get(int airplaneID);
    void update(Airplane updAirplane);
}
