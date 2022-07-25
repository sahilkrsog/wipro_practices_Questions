package com.gcet.dao;
import com.gcet.bean.EmployeeBean;
import com.gcet.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
public class EmployeeDAO {
	public int  insertEmployee(EmployeeBean bean) {
		int n =0;
		try {
			Connection con = DBUtil.getDBConnection();
			
			String sql = "insert into Employee values(?,?,?)";
			PreparedStatement st =con.prepareStatement(sql);
			
			st.setInt(1,bean.getEid());
			st.setString(2, bean.getEname());
			st.setInt(3, bean.getEalary());
			n=st.executeUpdate();
			
			
		
	}catch(Exception e ) {
		System.out.println(e);
	}
		return n;
		
	}public ArrayList<EmployeeBean> getAllEmployee(){
		ArrayList<EmployeeBean> list = new  ArrayList<EmployeeBean>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from Employee";
			EmployeeBean bean = new EmployeeBean();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet re = st.executeQuery();
			while(re.next()) {
				bean.setEid(re.getInt("eid"));
				bean.setEname(re.getString("ename"));
				bean.setEalary(re.getInt("esalary"));
				list.add(bean);
				
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
		
	}
	

}
