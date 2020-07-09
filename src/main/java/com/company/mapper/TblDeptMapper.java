package com.company.mapper;

import com.company.bean.TblDept;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 15:04
 */

public interface TblDeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(TblDept record);

    int insertSelective(TblDept record);

    TblDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(TblDept record);

    int updateByPrimaryKey(TblDept record);
}