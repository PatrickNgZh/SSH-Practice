package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;

public class StudentDaoImpl implements StudentDao {

    List<Student> list = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Student student = null;
    List<String> nameList=null;
    String studentName = null;

	@Override
	public List<Student> getAllSelectedInfo(String title) {
	    //这里的setString会自动单引号
		String myString = title+"%";
		list = new ArrayList<Student>();
        connection = ConnectionManager.getConnection();
        String sql = "SELECT * FROM student WHERE Sclass LIKE ?;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, myString);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                student = new Student();
                student.setSno(resultSet.getString("Sno"));
                student.setSname(resultSet.getString("Sname"));
                student.setSsex(resultSet.getString("Ssex"));
                student.setSage(resultSet.getInt("Sage"));
                student.setSphone(resultSet.getString("Sphone"));
                student.setSclass(resultSet.getString("Sclass"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
        return list;
	}

	@Override
	public boolean createStudentInfo(String no, String name) {
		return false;
	}

    @Override
    public List<String> getAllStudentName() {
        nameList = new ArrayList<String>();
        connection = ConnectionManager.getConnection();
        String sql = "SELECT Sname " +
                "FROM student;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                studentName = new String(resultSet.getString(1));
                nameList.add(studentName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
        return nameList;
    }

    @Override
    public Student getStudentInfoByName(String name) {
        student = new Student();
        connection = ConnectionManager.getConnection();
        String sql = "SELECT * " +
                "FROM student " +
                "WHERE Sname = ?;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                student.setSno(resultSet.getString("Sno"));
                student.setSname(resultSet.getString("Sname"));
                student.setSsex(resultSet.getString("Ssex"));
                student.setSage(resultSet.getInt("Sage"));
                student.setSphone(resultSet.getString("Sphone"));
                student.setSclass(resultSet.getString("Sclass"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
        return student;
    }

    @Override
    public boolean insertBasicInfo(String no, String name) {
        int row = 0;
        connection = ConnectionManager.getConnection();
        String sql = "INSERT INTO student (Sno, Sname) VALUES " +
                "  (?, ?);";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, no);
            preparedStatement.setString(2,name);
            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
        if (row == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteBySex(String sex) {
        int row = 0;
        connection = ConnectionManager.getConnection();
        String sql = "DELETE FROM student "
                + "WHERE Ssex = ?;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sex);
            row = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
        if (row != 0) {
            return true;
        } else {
            return false;
        }
    }

}
