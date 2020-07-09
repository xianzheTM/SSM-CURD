package com.company.mapper;

import com.company.bean.Department;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 15:04
 */

public interface TblDeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}