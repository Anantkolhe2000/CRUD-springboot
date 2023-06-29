package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

	public static Integer insert(Emp emp ) {
		int status=0;
	try {
		Connection connection=Myconn.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?)");
		preparedStatement.setInt(1, emp.getId());
		preparedStatement.setString(2, emp.getName());
		status=preparedStatement.executeUpdate();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}	
		
		return status;
	}

	public static int update(int id, String name, int updatedid) {
		int cheak=0;
		try {
			Connection connection=Myconn.getConnection();
			PreparedStatement statement=connection.prepareStatement("update emp set id=?,name=? where id=?");
             statement.setInt(1,updatedid);
             statement.setString(2,name);
             statement.setInt(3, id);
             cheak=statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cheak;
	}

	public static List<Emp> getall() {
		List<Emp> emps=new ArrayList<>();
		try {
			Connection connection=Myconn.getConnection();
			PreparedStatement statement=connection.prepareStatement("select *from emp");
			ResultSet resultSet=statement.executeQuery();
			while (resultSet.next()) {
				Emp emp=new Emp(resultSet.getInt(1), resultSet.getString(2));
				emps.add(emp);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
      e.printStackTrace();
		}
		return emps;
	}

	public static Integer delete(Integer id ) {
		int status=0;
	try {
		Connection connection=Myconn.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where id=?");
		preparedStatement.setInt(1,id);
		status=preparedStatement.executeUpdate();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}	
		
		return status;
	}	
}
