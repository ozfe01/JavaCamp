package odev3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Halit");
		student1.setLastName("özfe");
		student1.setSchoolName("ÇOMÜ");
		student1.setLessonsLearned("Java");
		
		Student student2 = new Student();
		student2.setName("derviþ");
		student2.setLastName("genç");
		student2.setSchoolName("KSÜ Halkla Ýliþkiler");
		student2.setLessonsLearned("Java");
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setCV("Web Developer");
		instructor.setLessonsTaught("Java" + "C#");
		
		System.out.println(student1.getId());
		System.out.println(student2.getSchoolName());
		System.out.println(instructor.getCV());
		
		
		
		
		

	}

}
