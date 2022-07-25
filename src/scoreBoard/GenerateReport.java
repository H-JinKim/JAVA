package scoreBoard;

import java.util.ArrayList;

import gradingSystem.BasicEvaluation;
import gradingSystem.GradeEvaluation;
import gradingSystem.MajorEvaluation;
import gradingSystem.PassOrFailEvaluation;
import utillity.Define;

public class GenerateReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
	public static final String LINE = "-------------------------------------\n";
	
	
	private StringBuffer buffer = new StringBuffer();  //buffer adds the String and print all at the end.
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		buffer.append("This is the beginnig of the report\n");
		
		
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
		
	}
	
	
	public void makeHeader(Subject subject){
		buffer.append(GenerateReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateReport.TITLE );
		buffer.append(GenerateReport.HEADER );
		buffer.append(GenerateReport.LINE);
	} 
	
	
	
	public void makeBody(Subject subject){
		
		ArrayList<Student> studentList = subject.getStudentList();  // 각 과목의 학생들
		
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajor().getSubjectName() + "\t");
			buffer.append(" | ");
			getScoreGrade(student, subject.getSubjectId());  //학생별 해당과목 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	
	
	public void getScoreGrade(Student student, int subjectId){ //printing student and score for each subject
		
		ArrayList<Score> scoreList = student.getScoreList();	//Creaing the list of scores of the student
		int majorId = student.getMajor().getSubjectId();		//get student major
		
		GradeEvaluation[] gradeEvalualtion = {new BasicEvaluation(), new PassOrFailEvaluation(),new MajorEvaluation() };//cannot create interface, have to call classes
		
		for (int i=0; i<scoreList.size(); i++) { // i from 0 to size, +1
			Score score = scoreList.get(i);
			String gradeLetter;
			if (score.getSubject().getSubjectId() == subjectId) {
				
				
				if(score.getSubject().getGradeType() == Define.PF_TYPE){
					gradeLetter = gradeEvalualtion[Define.PF_TYPE].getGrade(score.getGrade());
				}
				else if(score.getSubject().getSubjectId() == majorId) {
					gradeLetter = gradeEvalualtion[Define.SAB_TYPE].getGrade(score.getGrade());
				}
				else {
					gradeLetter = gradeEvalualtion[Define.AB_TYPE].getGrade(score.getGrade());
				}
				buffer.append(score.getGrade());
				buffer.append(":");
				buffer.append(gradeLetter);
				buffer.append(" | ");
				
			}
			
		}
		
		
	}
	
	public void makeFooter(){
		buffer.append("\n");
	}



}
