package com.company.mapper;

import com.company.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 17:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmployeeMapperTest {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
        employeeMapper.insert(new Employee(null, "王振", "男", "123@qq.com", 2, null));
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        Employee employee = employeeMapper.selectByPrimaryKey(2);
        System.out.println(employee);
    }

    @Test
    public void selectByPrimaryKeyWithDept() {
        Employee employee = employeeMapper.selectByPrimaryKeyWithDept(2);
        System.out.println(employee);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void batchInsert() {
        for (int i = 0; i < 1000; i++) {
            String name = UUID.randomUUID().toString().substring(0, 5).replace("-", "");
            employeeMapper.insert(new Employee(null, name, "男", name + "@gmail.com", 1, null));
        }
    }
}