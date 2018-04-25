package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import com.patrick.strutsnoticeboard.dao.ConnectionManager;
import com.patrick.strutsnoticeboard.dao.NoticeDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author peicong
 * @date 2018/4/23 0023
 */
public class NoticeDaoImpl implements NoticeDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Override
    public int getCount() {
        int result = 0;
        connection = ConnectionManager.getConnection();
        String sql = "select count(*) from notice";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                result = resultSet.getInt(1);
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
    }

    @Override
    public List<Notice> getAllNoticeList() {
        List<Notice> list = new ArrayList<>();
        connection = ConnectionManager.getConnection();
        String sql = "select * from notice";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Notice notice = new Notice();
                notice.setId(resultSet.getInt(1));
                notice.setTitle(resultSet.getString(2));
                notice.setContent(resultSet.getString(3));
                notice.setEditor(resultSet.getString(4));
                notice.setCreateTime(resultSet.getDate(5));
                notice.setType(resultSet.getInt(6));
                list.add(notice);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
    }

    @Override
    public List<Notice> getNoticeByType(int typeId) {
        List<Notice> list = new ArrayList<>();
        connection = ConnectionManager.getConnection();
        String sql = "select * from notice where Ntype=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, typeId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Notice notice = new Notice();
                notice.setId(resultSet.getInt(1));
                notice.setTitle(resultSet.getString(2));
                notice.setContent(resultSet.getString(3));
                notice.setEditor(resultSet.getString(4));
                notice.setCreateTime(resultSet.getDate(5));
                notice.setType(resultSet.getInt(6));
                list.add(notice);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
    }

    @Override
    public Notice getNoticeById(int noticeId) {
        connection = ConnectionManager.getConnection();
        String sql = "select * from notice where Nno=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, noticeId);
            resultSet = preparedStatement.executeQuery();
            Notice notice = new Notice();
            while (resultSet.next()) {
                notice.setId(resultSet.getInt(1));
                notice.setTitle(resultSet.getString(2));
                notice.setContent(resultSet.getString(3));
                notice.setEditor(resultSet.getString(4));
                notice.setCreateTime(resultSet.getDate(5));
                notice.setType(resultSet.getInt(6));
            }
            return notice;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionManager.closeAll(connection, preparedStatement, resultSet);
        }
    }

    @Override
    public boolean deleteNotice(int noticeId) {
        connection = ConnectionManager.getConnection();
        String sql = "delete Notice where Nno=?";
        try {
            int row = 0;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, noticeId);
            row = preparedStatement.executeUpdate();
            if (row > 0) {
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

    @Override
    public boolean addNotice(Notice notice) {
        connection = ConnectionManager.getConnection();
        String sql = "insert into Notice (Ntitle, Ncontent,Neditor,NcreateTime,Ntype) values(?,?,?,?,?)";
        try {
            int row = 0;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, notice.getTitle());
            preparedStatement.setString(2, notice.getContent());
            preparedStatement.setString(3, notice.getEditor());
            preparedStatement.setDate(4,new Date( new java.util.Date().getTime()));
            preparedStatement.setInt(5, notice.getType());
            row = preparedStatement.executeUpdate();
            if (row > 0) {
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
