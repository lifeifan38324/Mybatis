package com.atlff.mybatis.pojo;

/**
 * @author lifeifan
 * @Description
 * @create 2022-08-17 21:00
 */
public class User {
    private Integer id;
    private String uesrname;
    private String password;
    private Integer age;
    private String sex;
    private String email;

    public User() {
    }

    public User(Integer id, String uesrname, String password, Integer age, String sex, String email) {
        this.id = id;
        this.uesrname = uesrname;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUesrname(String uesrname) {
        this.uesrname = uesrname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getUesrname() {
        return uesrname;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uesrname='" + uesrname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
