package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flipkart.bean.UserLogin;
import com.flipkart.constants.Status;
import com.flipkart.constants.UserRole;
import com.flipkart.exception.InvalidCredentialsException;
import com.flipkart.utils.DBUtils;

public class CredentialsDAO {
	
	public static Status saveCredentials(UserLogin details) {
		Connection conn = null;
		PreparedStatement prep_stmt = null;
		try {
			conn = DBUtils.getConnection();
			String raw_stmt = "insert into credentials values(?,?,?)";
			prep_stmt = conn.prepareStatement(raw_stmt);
			prep_stmt.setString(1, details.getUserId());
			prep_stmt.setString(2, details.getPassword());
			prep_stmt.setString(3, details.getRole().toString());
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
	
	public static UserLogin verifyCredentials(String username, String password) throws InvalidCredentialsException{
		Connection conn = null;
		PreparedStatement prep_stmt = null;
		try {
			conn = DBUtils.getConnection();
			String raw_stmt = "select * from credentials where username=?";
			prep_stmt = conn.prepareStatement(raw_stmt);
			prep_stmt.setString(1, username);
			ResultSet result =  prep_stmt.executeQuery();
			result.absolute(1);
			if (result.getString(2) == password) {
				return new UserLogin(result.getString(1), result.getString(2), UserRole.valueOf(result.getString(3)));
			}
			else {
				throw new InvalidCredentialsException("Invalid password for " + username);
			}			
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
		throw new InvalidCredentialsException("Invalid username " + username);
	}
}
