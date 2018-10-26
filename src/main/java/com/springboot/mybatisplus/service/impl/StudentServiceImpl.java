package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Student;
import com.springboot.mybatisplus.mapper.StudentMapper;
import com.springboot.mybatisplus.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenmingjian
 * @since 2018-10-26
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
