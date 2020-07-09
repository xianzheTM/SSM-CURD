package com.company.service;

import com.company.bean.Employee;
import com.company.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 22:00
 */
@Service
public class EmployeeService {
    private EmployeeMapper employeeMapper;

    @Autowired
    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }

}
