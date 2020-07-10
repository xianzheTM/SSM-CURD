package com.company.bean;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/10 16:25
 */

public class TblDept {
    private Integer deptId;

    private String deptName;

    public TblDept() {
    }

    public TblDept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}