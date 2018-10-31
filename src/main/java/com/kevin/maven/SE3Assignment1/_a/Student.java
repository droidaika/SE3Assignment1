package com.kevin.maven.SE3Assignment1._a;


import java.util.ArrayList;


import org.joda.time.DateTime;
import org.joda.time.Years;


public class Student {

	public Student(String name, String iD,   DateTime DOB) {
		super();
		this.Name = name;
		this.ID = iD;
		this.DOB = DOB;
		Age =  getAge();
	}

	private String Name, ID, UserName;
	private int Age;

	private ArrayList<Module> ModuleList=new ArrayList<Module>();
	private DateTime DOB;
	

	





	private int getAge() {
		Years tempAge = Years.yearsBetween(DOB.toLocalDate(), DateTime.now().toLocalDate());
		return tempAge.getYears();

	}

	private ArrayList<Course> CourseList=new ArrayList<Course>();
	public ArrayList<Course> getCourseList() {
		return CourseList;
	}

	public void addCourseToList(Course course) {
		CourseList.add(course);
	}

	public ArrayList<Module> getModuleList() {
		return ModuleList;
	}

	public void addModuleToList(Module module) {
		ModuleList.add(module);
	}

	
	public String getUsername() {
		return Name + getAge();
	}

	

	

}