package com.jhblock.tjk_block.pojo;

public class Door {
    private String username;
    private  String password;
    private  String head_picture;
    private  String email;
    private  String uid;
    private  int islogin;

    @Override
    public String toString() {
        return "Door{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", head_picture='" + head_picture + '\'' +
                ", email='" + email + '\'' +
                ", uid='" + uid + '\'' +
                ", islogin=" + islogin +
                '}';
    }

    public Door() {
    }

    public Door(String username, String password, String head_picture, String email, String uid, int islogin) {
        this.username = username;
        this.password = password;
        this.head_picture = head_picture;
        this.email = email;
        this.uid = uid;
        this.islogin = islogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHead_picture() {
        return head_picture;
    }

    public void setHead_picture(String head_picture) {
        this.head_picture = head_picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getIslogin() {
        return islogin;
    }

    public void setIslogin(int islogin) {
        this.islogin = islogin;
    }
}
