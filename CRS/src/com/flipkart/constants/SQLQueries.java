/**
 * 
 */
package com.flipkart.constants;

/**
 * @author Rohit
 *
 */
public class SQLQueries {
	public static final String ADD_COURSE="insert into registration (courseid, studentid, grade) values ( ? , ?, ? )";
	public static final String IS_REGISTERED=" select courseid from registration where courseid=? and studentid=? ";
	public static final String NUMBER_OF_REGISTERED_COURSES=" select studentid from registration where studentid = ? ";
	public static final String DROP_COURSE = "delete from registration where courseid = ? AND studentid = ?;";
	public static final String GET_GRADES = "select courseid, grade from registration where studentid = ?;";
}