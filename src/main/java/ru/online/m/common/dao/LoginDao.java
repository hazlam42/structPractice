package ru.online.m.common.dao;

import ru.online.m.common.form.RegistrationForm;

import java.sql.SQLException;

public interface LoginDao {
    boolean addLogin(RegistrationForm regForm) throws SQLException;
}
