package scoreBoard;



public class Score {
	
	private int grade;
	private Subject subject;



	public Score(Subject subject, int grade) {
		this.subject = subject;
		this.grade = grade;
	
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

		
	}
	
	

