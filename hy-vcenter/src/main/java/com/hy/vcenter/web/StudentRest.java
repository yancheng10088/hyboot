package com.hy.vcenter.web;

import com.hy.vcenter.entity.Student;
import com.hy.vcenter.mapper.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRest {

    @Resource
    StudentMapper studentMapper;

    @GetMapping("list")
    public String list(){
        List<Student> students = studentMapper.selectList(null);
        return students.toString();
    }
}
