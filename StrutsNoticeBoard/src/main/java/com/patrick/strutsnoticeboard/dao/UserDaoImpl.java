package com.patrick.strutsnoticeboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Override
    public boolean vertifyUser(String name, String password) {
        connection = ConnectionManager.getConnection();
        String sql = "select * " +
                "from user_table " +
                "where name = ? and password = ?;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            int row = 0;
            while (resultSet.next()) {
                ++row;
            }
            if (row >= 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
    }
}
