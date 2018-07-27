package ru.online.m.common.services;

import ru.online.m.common.dao.impl.LoginDaoImplementation;
import ru.online.m.common.form.RegistrationForm;

public class LoginService {
    private LoginDaoImplementation loginDao = new LoginDaoImplementation();

    public boolean addLogin(RegistrationForm registrationForm) {
        return loginDao.addLogin(registrationForm);
    }
}
