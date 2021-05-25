package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flipkart.bean.Course;
import com.flipkart.bean.CourseRegistration;
import com.flipkart.bean.ReportCard;
import com.flipkart.constants.SQLQueries;
import com.flipkart.constants.Status;
import com.flipkart.utils.DBUtils;

public class StudentDaoImplementation implements StudentDaoInterface {

	private static volatile StudentDaoImplementation instance=null;
	private PreparedStatement stmt = null;
	public static StudentDaoImplementation getInstance()
	{
		if(instance==null)
		{
			synchronized(StudentDaoImplementation.class){
				instance=new StudentDaoImplementation();
			}
		}
		return instance;
	}
	
	@Override
	public Status semesterRegistration(int studentId, CourseRegistration courses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCourse(int studentId, String courseId) throws SQLException {
		Connection conn = DBUtils.getConnection();
		try 
		{
			stmt = conn.prepareStatement(SQLQueries.ADD_COURSE);
			stmt.setString(1, courseId);
			stmt.setInt(2, studentId);
			stmt.setString(3, "Z");
			stmt.executeUpdate();
			return true;
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			stmt.close();
			//conn.close();
		}
		return false;
	}

	@Override
	public Status dropCourse(int studentId, String courseId) throws SQLException {
		Connection conn = DBUtils.getConnection();
		
		try
		{
			stmt = conn.prepareStatement(SQLQueries.DROP_COURSE);
			stmt.setString(1, courseId);
			stmt.setInt(2, studentId);
			stmt.execute();
			stmt.close();
			
			return Status.SUCCESS;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{

			stmt.close();
			//conn.close();
		}
		
		return Status.FAIL;
	}

	@Override
	public Course[] viewRegisteredCourses(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportCard viewReportCard(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRegistered(String courseId, int studentId) throws SQLException {
		Connection conn = DBUtils.getConnection();
		
		boolean check = false;
		try
		{
			stmt = conn.prepareStatement(SQLQueries.IS_REGISTERED);
			stmt.setString(1, courseId);
			stmt.setInt(2, studentId);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.toString());
				check = true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			stmt.close();
			//conn.close();
		}
		
		return check;
	}

	@Override
	public int numOfRegisteredCourses(int studentId) throws SQLException{
Connection conn = DBUtils.getConnection();
		
		int registered_course_count = 0;
		try
		{
			stmt = conn.prepareStatement(SQLQueries.NUMBER_OF_REGISTERED_COURSES);
			stmt.setInt(1, studentId);
			ResultSet rs = stmt.executeQuery();	
			while(rs.next())
			{
				registered_course_count+=1;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			stmt.close();
			//conn.close();
		}
		
		return registered_course_count;
	}

}
