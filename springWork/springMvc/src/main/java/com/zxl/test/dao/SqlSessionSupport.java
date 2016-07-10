package com.zxl.test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;

public class SqlSessionSupport {

	private static SqlSessionFactory sqlSessionFactory;
	
	private static Reader reader;
	
	public SqlSession getSqlSession(){
		try{
			reader = Resources.getResourceAsReader("applicationContext.xml");
			sqlSessionFactory = new  SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			
		}
		return sqlSessionFactory.openSession();
	}
}
