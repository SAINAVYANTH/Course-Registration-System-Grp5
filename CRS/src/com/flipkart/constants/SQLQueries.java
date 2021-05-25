/**
 * 
 */
package com.flipkart.constants;

/**
 * @author Rohit
 *
 */
public class SQLQueries {
	public static final String ADD_COURSE="insert into grade (courseid, studentid, grade) values ( ? , ?, ? )";
	public static final String IS_REGISTERED=" select courseid from grade where courseid=? and studentid=? ";
	public static final String NUMBER_OF_REGISTERED_COURSES=" select studentid from grade where studentid = ? ";
	public static final String DROP_COURSE = "delete from grade where courseid = ? AND studentid = ?;";
	public static final String GET_GRADES = "select courseid, grade from grade where studentid = ?;";
}