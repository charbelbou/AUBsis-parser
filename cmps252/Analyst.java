package cmps252;

import java.util.Set;

public interface Analyst {
//	String getCourseLocation(String courseName);
//	int getAvailableSeatsByCourseName(String courseName);
//	int getAvailableSeatsByCRN(String crn);
	Set<Course>getCoursesTaughtByProf(String profName);
	
	Course getCourseByCrn(String crn);
	Set<Course>GetCoursesByCourseName(String courseName);
	Set<Course>GetCoursesByLocationString(String location);
	Set<Course>GetCoursesByLocation(Location location);
}