package com.patrick.strutsnoticeboard.dao.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author peicong
 * @date 2018/4/24 0024
 */
public class UserDaoImplTest {

  @Test
  public void vertifyUser() {
    System.out.println(new UserDaoImpl().vertifyUser("admin","admin"));
    System.out.println(new UserDaoImpl().vertifyUser("abc","abc"));
  }
}