package com.gcet.service;
import com.gcet.bean.EmployeeBean;
import com.gcet.dao.EmployeeDAO;
import java.util.ArrayList;
public class EMSService {
	static EmployeeDAO dao = new EmployeeDAO();

	public static void insertEmployee(int eid,String ename,int esalary) {
		// TODO Auto-generated method stub
		EmployeeBean bean = new EmployeeBean();
		bean.setEid(eid);
		bean.setEname(ename);
		bean.setEalary(esalary);
		
		
		int n = dao.insertEmployee(bean);
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		list = dao.getAllEmployee();
		System.out.println(list);
		if(n!=0) {
			System.out.println("Va ");
			
		}
		else {
			System.out.println("Recored Not inserted ");
		}
		
		

	}

}
