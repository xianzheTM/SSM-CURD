package com.company.controller;

import com.company.bean.Msg;
import com.company.bean.TblEmp;
import com.company.service.TblEmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/8 21:42
 */
@Controller
public class TblEmpController {
    private TblEmpService tblEmpService;

    @Autowired
    public void setTblEmpService(TblEmpService tblEmpService) {
        this.tblEmpService = tblEmpService;
    }

    @RequestMapping("/emps")
    @ResponseBody
    public Msg getEmpWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 5);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<TblEmp> emps = tblEmpService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo<TblEmp> page = new PageInfo<>(emps, 5);
        //直接返回对象,等会把对象转为json
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping(value = "/emps", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveEmp(@Valid TblEmp tblEmp, BindingResult result) {
        if (result.hasErrors()) {
            List<FieldError> errors = result.getFieldErrors();
            Map<String, Object> map = new HashMap<>();
            errors.forEach(e -> map.put(e.getField(), e.getDefaultMessage()));
            return Msg.fail().add("errorFields", map);
        } else {
            tblEmpService.saveEmp(tblEmp);
            return Msg.success();
        }
    }
}
