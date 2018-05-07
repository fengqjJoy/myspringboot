package com.joy.java.util.excelutil;

/**
 * @Project: sfrzapi
 * @Package: com.hnzr.utils.excelUtil
 * @Author: 冯前进
 * @Date: 2018-03-28 14:12
 * @Description: TODO
 **/
public class Man {
    private String name;
    private int sex;
    private String idCard;
    private float salary;
    public Man(String name, int sex, String idCard, float salary) {
        super();
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.salary = salary;
    }

    public Man() {
        super();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
