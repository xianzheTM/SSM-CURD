package com.company.bean;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 15:04
 */

public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Integer dId;

    private Department dept;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String gender, String email, Integer dId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public Employee(Integer empId, String empName, String gender, String email, Integer dId, Department dept) {
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

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
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