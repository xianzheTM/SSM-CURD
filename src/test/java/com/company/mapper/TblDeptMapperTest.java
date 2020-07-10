package com.company.mapper;

import com.company.bean.TblDept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/10 16:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TblDeptMapperTest {
    @Autowired
    TblDeptMapper tblDeptMapper;
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void selectAll() {
        List<TblDept> tblDepts = tblDeptMapper.selectAll();
        tblDepts.forEach(System.out::println);
    }
}