package odev3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Halit");
		student1.setLastName("�zfe");
		student1.setSchoolName("�OM�");
		student1.setLessonsLearned("Java");
		
		Student student2 = new Student();
		student2.setName("dervi�");
		student2.setLastName("gen�");
		student2.setSchoolName("KS� Halkla �li�kiler");
		student2.setLessonsLearned("Java");
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setCV("Web Developer");
		instructor.setLessonsTaught("Java" + "C#");
		
		System.out.println(student1.getId());
		System.out.println(student2.getSchoolName());
		System.out.println(instructor.getCV());
		
		
		
		
		

	}

}
