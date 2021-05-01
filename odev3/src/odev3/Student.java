package odev3;

public class Student extends User {
	private String lessonsLearned;
	private String schoolName;
	public String getLessonsLearned() {
		return lessonsLearned;
	}
	public void setLessonsLearned(String lessonsLearned) {
		this.lessonsLearned = lessonsLearned;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
