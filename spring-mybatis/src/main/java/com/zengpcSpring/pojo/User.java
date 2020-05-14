package com.zengpcSpring.pojo;


public class User {
    private String rowId;
    private String userCode;
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "rowId='" + rowId + '\'' +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public User() {

    }

    public User(String rowId, String userCode, String userName) {
        this.rowId = rowId;
        this.userCode = userCode;
        this.userName = userName;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
