package cmps252;

import java.util.Set;

public interface Course {
	String getTerm();
	String getC_R_N();
	String getSubject();
	String getCode();
	String getSection();
	String getTitle();
	String getCredit_Hours();
	String getBILLING_HOURS();
	String getCOLLEGE();
	String getACTUAL_ENROLMENT();
	String getSEATS_AVAILABLE();
	
	Set<CourseSession> getCourseSessions();
	
	Instructor getInstructor();
}
