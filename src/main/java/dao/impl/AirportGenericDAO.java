package dao.impl;

import dao.IAirportGenericDAO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirportGenericDAO<T> implements IAirportGenericDAO<T> {
    private static SessionFactory sessionFactory;
    private Class<T> entityType;

    private static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();
        }
        return sessionFactory;
    }

    @Override
    public List<T> getAll() {
        Session session = getSessionFactory().openSession();
        Criteria cb = session.createCriteria(entityType);
        List<T> entityList = cb.list();
        session.close();
        return entityList;
    }

    @Override
    public T add(T newAirport) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(newAirport);
        transaction.commit();
        session.close();
        return newAirport;
    }

    @Override
    public boolean delete(T rmAirport) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(rmAirport);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public T get(int airportID) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        T ticket = session.get(entityType, airportID);
        transaction.commit();
        session.close();
        return ticket;
    }

    @Override
    public void update(T updAirport) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(updAirport);
        transaction.commit();
        session.close();
    }
}
