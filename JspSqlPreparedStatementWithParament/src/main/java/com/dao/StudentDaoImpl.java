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
            // TODO Auto-generated catch block
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
    
}
