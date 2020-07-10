package com.company.service;

import com.company.bean.TblDept;
import com.company.mapper.TblDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/10 16:20
 */
@Service
public class TblDeptService {
    private TblDeptMapper tblDeptMapper;

    @Autowired
    public void setTblDeptMapper(TblDeptMapper tblDeptMapper) {
        this.tblDeptMapper = tblDeptMapper;
    }

    public List<TblDept> getDepts() {
        List<TblDept> list = tblDeptMapper.selectAll();
        return list;
    }
}
