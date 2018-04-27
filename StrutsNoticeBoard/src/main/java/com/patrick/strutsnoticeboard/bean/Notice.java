package com.patrick.strutsnoticeboard.bean;

import java.util.*;

public class Notice {
  private int id;
  private String title;
  private String content;
  private String editor;
  private Date createTime;
  private int type;

  public Notice() {

  }

  public Notice(String title, String content, String editor, Date createTime, int type) {
    this.title = title;
    this.content = content;
    this.editor = editor;
    this.createTime = createTime;
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Notice{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", editor='" + editor + '\'' +
            ", createTime=" + createTime +
            ", type=" + type +
            '}';
  }
}
