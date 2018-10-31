package com.kevin.maven.SE3Assignment1._a;


import java.util.ArrayList;



public class Module {

	private String ModuleName, ID;
	private ArrayList<Student> StudentsList=new ArrayList<Student>();
	public ArrayList<Student> getStudentsList() {
		return StudentsList;
	}
	public void addStudentToList(Student student) {
		StudentsList.add(student);
	}
	public ArrayList<Course> getCourseList() {
		return CourseList;
	}
	public void addCourseToList(Course course) {
		CourseList.add(course);
	}
	private ArrayList<Course> CourseList=new ArrayList<Course>();
	public Module(String moduleName, String iD) {
		super();
		ModuleName = moduleName;
		ID = iD;
	}

	

}