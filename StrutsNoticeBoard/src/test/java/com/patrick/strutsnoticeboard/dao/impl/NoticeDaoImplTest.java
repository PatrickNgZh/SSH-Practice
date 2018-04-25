package com.patrick.strutsnoticeboard.dao.impl;

import com.patrick.strutsnoticeboard.bean.Notice;
import org.junit.Test;

import java.util.List;

/**
 * @author peicong
 * @date 2018/4/23 0023
 */
public class NoticeDaoImplTest {

  @Test
  public void getCount() {
    System.out.println(new NoticeDaoImpl().getCount());
  }

  @Test
  public void getAllNoticeList() {
    List<Notice> list = new NoticeDaoImpl().getAllNoticeList();
    for (Notice notice : list) {
      System.out.println(notice);
    }
  }

  @Test
  public void getNoticeByType() {
    List<Notice> list = new NoticeDaoImpl().getNoticeByType(1);
    for (Notice notice : list) {
      System.out.println(notice);
    }
  }

  @Test
  public void getNoticeById() {
    System.out.println(new NoticeDaoImpl().getNoticeById(2));
  }

  @Test
  public void deleteNotice() {
      System.out.println(new NoticeDaoImpl().deleteNotice(27));
  }

    @Test
    public void addNotice() {
        System.out.println(new NoticeDaoImpl().addNotice(new Notice("test",
                "test",
                "me",
                2
        )));
    }
}