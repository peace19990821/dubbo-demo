package com.wts.service;

import com.wts.pojo.Student;

public interface StudentService {

	/**
	 * @Title: getById 
	 * @Description: 根据id 获取一个学生
	 * @param id
	 * @return
	 * @return: Student
	 */
	Student getById(int id);
	
	/**
	 * @Title: addAge 
	 * @Description: 增加年龄
	 * @param n
	 * @return
	 * @return: Student
	 */
	Student addAge(Student stu,int n);
}
