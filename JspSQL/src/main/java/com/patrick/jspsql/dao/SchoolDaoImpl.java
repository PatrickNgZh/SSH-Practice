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
        } finally {
            Conn.closeAll(connection, preparedStatement, resultSet);
        }
        if (row == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteData() {
        int row = 0;
        try {
            connection = Conn.getConnection();
            String sql = "DELETE FROM student " +
                    "WHERE Sno = '150102102416';";
            preparedStatement = connection.prepareStatement(sql);
            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conn.closeAll(connection, preparedStatement, resultSet);
        }
        if (row == 1) {
            return true;
        } else {
            return false;
        }
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
            Conn.closeAll(connection, preparedStatement, resultSet);
        }
        if (row == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void retrieveData() {
        try {
            connection = Conn.getConnection();
            String sql = "SELECT * " +
                    "FROM student " +
                    "WHERE Sage > 20;";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                for (int i = 1; i <= 6; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conn.closeAll(connection, preparedStatement, resultSet);
        }
    }

    @Override
    public boolean deleteMenData() {
        int row=0;
        try {
            connection = Conn.getConnection();
            String sql = "DELETE FROM student " +
                    "WHERE Ssex = '男';";
            preparedStatement = connection.prepareStatement(sql);
            row=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conn.closeAll(connection,preparedStatement,resultSet);
        }
        if (row > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void retrieveClassData() {
        try {
            connection = Conn.getConnection();
            String sql = "SELECT * " +
                    "FROM student " +
                    "WHERE Sclass LIKE  '信科%';";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                for (int i = 1; i <= 6; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conn.closeAll(connection, preparedStatement, resultSet);
        }
    }
}
