package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.winter.app.departments.DepartmentDAO.";
	
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("DAO List");
		return session.selectList("list");//namespace.id명
		
	}
	
	public DepartmentDTO detail(String num) {
		return session.selectOne(NAMESPACE+"detail", num);
	}
	
}
