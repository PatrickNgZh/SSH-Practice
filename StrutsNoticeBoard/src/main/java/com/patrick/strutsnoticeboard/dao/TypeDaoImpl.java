//package com.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.bean.NoticeType;
//
//public class TypeDaoImpl implements TypeDao {
//
//    List<NoticeType> list = null;
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//    ResultSet resultSet = null;
//    NoticeType noticeType = null;
//
//    @Override
//    public List<NoticeType> getAllNoticeType() {
//        list = new ArrayList<NoticeType>();
//        connection = ConnectionManager.getConnection();
//        String sql = "SELECT * FROM Type;";
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                noticeType = new NoticeType();
//                noticeType.setNo(resultSet.getInt("Tno"));
//                noticeType.setName(resultSet.getString("TtypeName"));
//                list.add(noticeType);
//            }
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//            return null;
//        } finally {
//            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
//        }
//        return list;
//    }
//
//}
