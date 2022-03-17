package com.hy.vcenter.service.impl;/**
 * @author yancheng
 * @date 2022/3/16 12:39
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.vcenter.entity.Student;
import com.hy.vcenter.mapper.StudentMapper;
import com.hy.vcenter.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
}
