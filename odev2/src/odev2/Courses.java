package odev2;

public class Courses {
	String name;
	String teacher;
	double progress;
	
	
	public Courses() {
		System.out.println("�al���yor");
	}
	
	public Courses(String name,String teacher,double progress) {
		this(); //en ba�a yazmak laz�m
		
		this.name = name;
		this.teacher = teacher;
		this.progress = progress;
		
	}
	
}
