package com.patrick.strutsnoticeboard.converter;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author peicong
 * @date 2018/4/25 0025
 */
public class DateConverter extends StrutsTypeConverter {

  @Override
  public Object convertFromString(Map map, String[] strings, Class aClass) {
    DateFormat dateFormat = DateFormat.getDateInstance();
    String deal = strings[0].substring(0, 4) + "-"
            + strings[0].substring(4, 6) + "-"
            + strings[0].substring(6, 8);
    try {
      Date date = dateFormat.parse(deal);
      return date;
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public String convertToString(Map map, Object o) {
    Date date = (Date) o;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");
    return simpleDateFormat.format(date);
  }
}
