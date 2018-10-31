package com.kevin.maven.SE3Assignment1._a;


import java.util.ArrayList;


import org.joda.time.DateTime;


public class Course {

	private String CourseName, ID;
	private ArrayList<Student> StudentsList=new ArrayList<Student>();
	private ArrayList<Module> ModuleList=new ArrayList<Module>();
	private DateTime StartDate, EndDate;
	public String getName() {
		return CourseName;
	}
	public Course(String courseName, String iD, DateTime startDate, DateTime endDate) {
		super();
		CourseName = courseName;
		ID = iD;
		StartDate = startDate;
		EndDate = endDate;
	}

	public String getID() {
		return ID;
	}

	public ArrayList<Student> getStudentsList() {
		return StudentsList;
	}
	public void setStudentsList(ArrayList<Student> studentsList) {
		StudentsList = studentsList;
	}
	public ArrayList<Module> getModuleList() {
		return ModuleList;
	}
	public void setModuleList(ArrayList<Module> moduleList) {
		ModuleList = moduleList;
	}
	public DateTime getStartDate() {
		return StartDate;
	}
	public void setStartDate(DateTime startDate) {
		StartDate = startDate;
	}
	public DateTime getEndDate() {
		return EndDate;
	}
	public void setEndDate(DateTime endDate) {
		EndDate = endDate;
	}
	

	

	

}