package com.company.bean;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Pattern;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 15:04
 */

public class TblEmp {
    private Integer empId;
    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})", message = "用户名可以是2-5位中文或者6-16位英文和数字的组合")
    private String empName;

    private String gender;
    @Pattern(regexp = "^([a-z0-9_.-]+)@([\\da-z.-]+)\\.([a-z.]{2,6})$", message = "邮箱格式不正确")
    private String email;

    private Integer dId;

    private TblDept dept;

    public TblEmp() {
    }

    public TblEmp(Integer empId, String empName, String gender, String email, Integer dId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public TblEmp(Integer empId, String empName, String gender, String email, Integer dId, TblDept dept) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
        this.dept = dept;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public TblDept getDept() {
        return dept;
    }

    public void setDept(TblDept dept) {
        this.dept = dept;
    }

    // @Override
    // public String toString() {
    //     return "TblEmp{" +
    //             "empId=" + empId +
    //             ", empName='" + empName + '\'' +
    //             ", gender='" + gender + '\'' +
    //             ", email='" + email + '\'' +
    //             ", dId=" + dId +
    //             ", dept=" + dept +
    //             '}';
    // }
}