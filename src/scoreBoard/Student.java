package scoreBoard;

import java.util.ArrayList;

public class Student {
	private String name;
	private int studentId;
	private Subject major;
	
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();	//grade list
	
	
	

	public Student(String name, int studentId, Subject major) {	//generates a new student profile
		this.name = name;
		this.studentId = studentId;
		this.major = major;
	}
	
	public void addStudentScore(Score score) {
		scoreList.add(score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Subject getMajor() {
		return major;
	}
	public void setMajor(Subject major) {
		this.major = major;
		
	}
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public void addSubjectScore(Score score) {
		scoreList.add(score);
		// TODO Auto-generated method stub
		
	}
	
	
	

}
