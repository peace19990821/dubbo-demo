package com.wts.service.impl;

import com.wts.pojo.Student;
import com.wts.service.StudentService;

public class StudentServiceImpl implements StudentService{

	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("张三" + id);
		return student;
	}

	public Student addAge(Student stu,int n) {
		// 增加年龄
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}
