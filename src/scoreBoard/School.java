package scoreBoard;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	
	private School()	{}
	
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();			
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public static void setInstance(School instance) {
		School.instance = instance;
	}
	

}
