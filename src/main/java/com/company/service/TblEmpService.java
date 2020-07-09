package com.company.service;

import com.company.bean.TblEmp;
import com.company.mapper.TblEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 22:00
 */
@Service
public class TblEmpService {
    private TblEmpMapper tblEmpMapper;

    @Autowired
    public void setTblEmpMapper(TblEmpMapper tblEmpMapper) {
        this.tblEmpMapper = tblEmpMapper;
    }

    public List<TblEmp> getAll() {
        return tblEmpMapper.selectAll();
    }

}
