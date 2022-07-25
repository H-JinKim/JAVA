package scoreBoard;

import utillity.Define;

public class Test {
		
		School goodSchool = School.getInstance();
		Subject Korean;
		Subject math;
		Subject dance;
		
		
		GenerateReport report =  new GenerateReport();


		
		public static void main(String[] args) {
			
			Test test = new Test();
			
			test.creatSubject();
			test.createStudent();
			
			String report = test.report.getReport(); //성적 결과 생성
			System.out.println(report); // 출력
			
		}
		
		//테스트 과목 생성
		public void creatSubject(){
			
			Korean = new Subject(Define.Korean, "국어");
			math = new Subject(Define.Math, "수학");
			dance = new Subject(Define.Dance, "춤");
			
			goodSchool.addSubject(Korean);
			goodSchool.addSubject(math);
			goodSchool.addSubject(dance);
		}
		
		//테스트 학생 생성
		public void createStudent(){
			
			Student student1 = new Student("강감찬", 211213, Korean  );
			Student student2 = new Student("김유신", 212330, math  );
			Student student3 = new Student("신사임당", 201518, Korean  );
			Student student4 = new Student("이순신", 202360, Korean  );
			Student student5 = new Student("홍길동", 201290, math );
			
			goodSchool.addStudent(student1);
			goodSchool.addStudent(student2);
			goodSchool.addStudent(student3);
			goodSchool.addStudent(student4);
			goodSchool.addStudent(student5);

			Korean.register(student1);
			Korean.register(student2);
			Korean.register(student3);
			Korean.register(student4);
			Korean.register(student5);
			
			math.register(student1);
			math.register(student2);
			math.register(student3);
			math.register(student4);
			math.register(student5);
			
			dance.register(student1);
			dance.register(student2);
			dance.register(student3);
			
			addScoreForStudent(student1, Korean, 95); 
			addScoreForStudent(student1, math, 56);	
			addScoreForStudent(student1, dance, 70);
			
			addScoreForStudent(student2, Korean, 95); 
			addScoreForStudent(student2, math, 95);	
			addScoreForStudent(student2, dance, 40);
			
			addScoreForStudent(student3, Korean, 100); 
			addScoreForStudent(student3, math, 88);	
			addScoreForStudent(student3, dance, 60);
			
			addScoreForStudent(student4, Korean, 89); 
			addScoreForStudent(student4, math, 95);	
			
			addScoreForStudent(student5, Korean, 85); 
			addScoreForStudent(student5, math, 56);	
		}

		//과목별 성적 입력
		public void addScoreForStudent(Student student, Subject subject, int grade){
			
			Score score = new Score(subject, grade);
			student.addSubjectScore(score);
			
		}

	
}

