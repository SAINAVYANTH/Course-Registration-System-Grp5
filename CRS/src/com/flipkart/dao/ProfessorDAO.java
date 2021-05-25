package com.flipkart.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flipkart.bean.Professor;
import com.flipkart.constants.Status;
import com.flipkart.exception.InvalidProfessorIdException;
import com.flipkart.utils.DBUtils;

public class ProfessorDAO {
	
	public static Status saveProfessorDetails(Professor details) {
		Connection conn = null;
		PreparedStatement prep_stmt = null;
		try {
			conn = DBUtils.getConnection();
			String raw_stmt = "insert into professors values(?,?,?,?,?,?,?)";
			prep_stmt = conn.prepareStatement(raw_stmt);
			prep_stmt.setString(1, details.getId());
			prep_stmt.setString(2, details.getName());
			prep_stmt.setDate(3, (Date) details.getDob());
			prep_stmt.setString(4, details.getEmail());
			prep_stmt.setString(5, details.getAddress());
			prep_stmt.setString(6, details.getDepartment());
			prep_stmt.setString(7, details.getDesignation());
			prep_stmt.executeUpdate();
			return Status.SUCCESS;
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
		    e.printStackTrace();
		}finally{
			try{
		    	if(prep_stmt!=null)
		            prep_stmt.close();
		    }catch(SQLException se2){}
		    try{
		        if(conn!=null)
		            conn.close();
		    }catch(SQLException se){
		        se.printStackTrace();
		    }
		}
		return Status.FAIL;
	}
	
	public static Professor getProfessorDetails(int id) throws InvalidProfessorIdException {
		Connection conn = null;
		PreparedStatement prep_stmt = null;
		try {
			conn = DBUtils.getConnection();
			String raw_stmt = "select * from professors where id=?";
			prep_stmt = conn.prepareStatement(raw_stmt);
			prep_stmt.setInt(1, id);
			ResultSet result =  prep_stmt.executeQuery();
			result.absolute(1);
			return new Professor(result.getString(1), result.getString(2), result.getDate(3), result.getString(4), 
					result.getString(5), result.getString(6), result.getString(7));
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
		    e.printStackTrace();
		}finally{
			try{
		    	if(prep_stmt!=null)
		            prep_stmt.close();
		    }catch(SQLException se2){}
		    try{
		        if(conn!=null)
		            conn.close();
		    }catch(SQLException se){
		        se.printStackTrace();
		    }
		}
		throw new InvalidProfessorIdException("Invalid id " + id);
	}
	
	
}
