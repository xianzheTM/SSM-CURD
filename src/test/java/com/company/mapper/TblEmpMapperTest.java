package com.company.mapper;

import com.company.bean.TblEmp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 17:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TblEmpMapperTest {
    @Autowired
    TblEmpMapper tblEmpMapper;

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectByPrimaryKeyWithDept() {
        TblEmp tblEmp = tblEmpMapper.selectByPrimaryKeyWithDept(2);
        System.out.println(tblEmp);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}