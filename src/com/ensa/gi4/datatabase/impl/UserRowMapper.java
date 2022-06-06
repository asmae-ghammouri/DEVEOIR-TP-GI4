package com.ensa.gi4.datatabase.impl;

import com.ensa.gi4.appuser.AppUser;
import com.ensa.gi4.modele.Materiel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<AppUser> { @Override
public AppUser mapRow(ResultSet resultSet, int i) throws SQLException {
    AppUser user = new AppUser() { // because it is abstract
    };

    String userName = resultSet.getString(2);
    String password = resultSet.getString(3);
    String role = resultSet.getString(4);
   user.setUserName(userName);
    user.setPassword(password);
    user.setAppUserRole(role);
    return user;
}
}