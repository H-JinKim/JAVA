package scoreBoard;

import java.util.ArrayList;

import utillity.Define;

public class Subject {
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();		//The list of students
	
	Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		
		
		//finding the first digit of the subjectId 1 = normal, 2 = elective
		
		int subjectFirstDigit;
		while (subjectId >=10) {
			subjectId /= 10;
		}
		subjectFirstDigit = subjectId;
		if(subjectFirstDigit == 1) {
			gradeType = Define.AB_TYPE;
		}
		else {
			gradeType = Define.PF_TYPE;
		}
		
		
		
			
	}
	
	
	public void register (Student student) {	//Tool to add a student
		studentList.add(student);
	}
	
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
		
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}
