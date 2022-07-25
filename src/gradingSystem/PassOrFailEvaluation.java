package gradingSystem;

public class PassOrFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		String grade;
		
		
		if(point>=49) {
			grade = "Pass";
		}
		else {
			grade = "Fail";
		}
		return grade;
	}
	
	

}
