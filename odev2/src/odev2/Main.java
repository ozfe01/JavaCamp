package odev2;

public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses();
		courses1.name = "Java Kamp�";
		courses1.teacher = "Engin Demiro�";
		courses1.progress = 0.15;
		
		Courses courses2 = new Courses();
		courses2.name = "C#";
		courses2.teacher = "Engin Demiro�";
		courses2.progress = 0.23;
		
		Courses courses3 = new Courses("Haz�rl�k","Engin Demiro�",0.5);
		
		Courses[] courses = {courses1,courses2,courses3};
		for(Courses kurs:courses) {
			System.out.println(kurs.name);
			
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.registerCourse(kurs);
		coursesManager.registerCourse(courses1);
		
		BitirVeDevam bitir = new BitirVeDevam();
		bitir.finishAndContinue(courses2);
		
			
		}
	}
}