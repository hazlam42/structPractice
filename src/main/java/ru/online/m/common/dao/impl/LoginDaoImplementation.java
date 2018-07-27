package ru.online.m.common.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.online.m.common.dao.LoginDao;
import ru.online.m.common.form.RegistrationForm;
import ru.online.m.common.utilities.HibernateUtilities;

public class LoginDaoImplementation implements LoginDao {
    @Override
    public boolean addLogin(RegistrationForm regForm) {
        boolean access = false;

        SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        return false;
    }
}
