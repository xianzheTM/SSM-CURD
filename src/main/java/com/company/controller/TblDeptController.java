package com.company.controller;

import com.company.bean.Msg;
import com.company.bean.TblDept;
import com.company.service.TblDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/10 16:18
 */
@Controller
public class TblDeptController {
    private TblDeptService tblDeptService;

    @Autowired
    public void setTblDeptService(TblDeptService tblDeptService) {
        this.tblDeptService = tblDeptService;
    }

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<TblDept> list= tblDeptService.getDepts();
        return Msg.success().add("depts", list);
    }
}
