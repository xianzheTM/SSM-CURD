package com.company.mapper;

import com.company.bean.TblDept;

import java.util.List;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/10 16:25
 */

public interface TblDeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(TblDept record);

    int insertSelective(TblDept record);

    TblDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(TblDept record);

    int updateByPrimaryKey(TblDept record);

    List<TblDept> selectAll();
}