package com.winter.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("Service List");
		
		//참조변수명.메서드명()
		//this 생략 가능
		List<DepartmentDTO> ar = this.departmentDAO.list();
		
		return ar;
		
	}
	
	public DepartmentDTO detail(String num) {
		return departmentDAO.detail(num);
	}
	
	public int create(DepartmentDTO departmentDTO) {
		return departmentDAO.create(departmentDTO);
	}
	
	public int delete(DepartmentDTO departmentDTO) {
		return departmentDAO.delete(departmentDTO);
	}
	
	public int update(DepartmentDTO departmentDTO) {
		return departmentDAO.update(departmentDTO);
	}

}