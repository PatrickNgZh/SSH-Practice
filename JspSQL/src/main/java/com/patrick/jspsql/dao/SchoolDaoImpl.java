package com.patrick.jspsql.dao;

import java.sql.*;

/**
 * @author peicong
 * @date 2018/3/16 0016
 */
public class SchoolDaoImpl implements SchoolDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Override
    public boolean createData() {
        int row = 0;
        try {
            connection = Conn.getConnection();
            String sql = "INSERT INTO student VALUES " +
                    "('150102102416', '小张', '女', 32, '13672025777', '数媒一班')";
            preparedStatement = connection.prepareStatement(sql);
            row = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Conn.closeAll(connection,preparedStatement,resultSet);
        }
        if (row == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        return false;
    }

    @Override
    public boolean updateData() {
        int row = 0;
        try {
            connection = Conn.getConnection();
            String sql = "UPDATE student " +
                    "SET Sclass = '数媒二班'" +
                    "WHERE Sno = '150102102416';";
            preparedStatement = connection.prepareStatement(sql);
            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conn.closeAll(connection,preparedStatement,resultSet);
        }
        if (row == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void retrieveData() {
//        connection = Conn.getConnection();
//        String sql="updata"
    }
}
