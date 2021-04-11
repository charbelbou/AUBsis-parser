package cmps252;

import java.util.Set;

public class CourseC implements Course{
	String term;
	String crn;
	String subject;
	String code;
	String section;
	String title;
	String credits;
	String billingh;
	String college;
	String Aenrolment;
	String seatsavailable;
	public String getTerm() {
		return term;
	}
	public String getC_R_N() {
		return crn;
	}
	public String getSubject() {
		return subject;
	}
	public String getCode() {
		return code;
	}
	public String getSection() {
		return section;
	}
	public String getTitle() {
		return title;
	}
	public String getCredit_Hours() {
		return credits;
	}
	public String getBILLING_HOURS() {
		return billingh;
	}
	public String getCOLLEGE() {
		return college;
	}
	public String getACTUAL_ENROLMENT() {
		return Aenrolment;
	}
	public String getSEATS_AVAILABLE() {
		return seatsavailable;
	}
	@Override
	public Set<CourseSession> getCourseSessions() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Instructor getInstructor() {
		// TODO Auto-generated method stub
		return null;
	}
}
