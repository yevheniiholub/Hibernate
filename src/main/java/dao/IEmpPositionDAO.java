package dao;

import entity.EmpPosition;

import java.util.List;

public interface IEmpPositionDAO {
    List<EmpPosition> getAll();
    EmpPosition add(EmpPosition newEmpPosition);
    boolean delete(EmpPosition rmEmpPosition);
    EmpPosition get(int empPositionID);
    void update(EmpPosition updEmpPosition);
}
