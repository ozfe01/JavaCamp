package odev2;

public class Courses {
	String name;
	String teacher;
	double progress;
	
	
	public Courses() {
		System.out.println("çalýþýyor");
	}
	
	public Courses(String name,String teacher,double progress) {
		this(); //en baþa yazmak lazým
		
		this.name = name;
		this.teacher = teacher;
		this.progress = progress;
		
	}
	
}
