package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.dao.ConnectionManager;
import com.patrick.strutsnoticeboard.dao.TypeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author peicong
 * @date 2018/4/23 0023
 */
public class TypeDaoImpl implements TypeDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Override
    public List<Type> getAllNoticeType() {
        List<Type> list = new ArrayList<>();
        connection = ConnectionManager.getConnection();
        String sql = "select * " +
                "from Type;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Type(resultSet.getInt(1), resultSet.getString(2)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
    }
}
