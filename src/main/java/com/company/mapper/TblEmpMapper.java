package com.company.mapper;

import com.company.bean.TblEmp;

import java.util.List;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 15:04
 */

public interface TblEmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(TblEmp record);

    int insertSelective(TblEmp record);

    TblEmp selectByPrimaryKey(Integer empId);

    TblEmp selectByPrimaryKeyWithDept(Integer empId);

    int updateByPrimaryKeySelective(TblEmp record);

    int updateByPrimaryKey(TblEmp record);

    List<TblEmp> selectAll();
}