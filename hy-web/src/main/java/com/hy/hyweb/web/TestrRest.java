package com.hy.hyweb.web;

import com.alibaba.fastjson.JSONObject;

import com.hy.backgroud.entity.User;
import com.hy.backgroud.service.IUserService;
import com.hy.hycommon.domain.AjaxResult;

import com.hy.hycommon.page.TableDataInfo;
import com.hy.vcenter.entity.Student;
import com.hy.vcenter.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestrRest  {


    @Resource
    IUserService userService;


    @Resource
    IStudentService studentService;

    @GetMapping("list")
    public AjaxResult list(){
        List<User> users = userService.list(null);
        List<Student> students = studentService.list();
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("user",users);
        jsonObject.put("students",students);
        return AjaxResult.success(jsonObject);
    }


    /*@GetMapping("page")
    public TableDataInfo page(){
        startPage();
        List<User> list = userService.list(null);
        return getDataTable(list);
    }*/
}
