package com.zxl.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zxl.test.dao.StudentDao;
import com.zxl.test.model.Student;

@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements  StudentDao {

	
	
	public List<Student> queryAll() {
		return getSqlSession().selectList("queryAll");
	}
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
	    super.setSqlSessionFactory(sqlSessionFactory);  
	}  


}
