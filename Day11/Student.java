package Collections;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int marks;
	public int getrollno() {
	return rollno;
	}
	public void setId(int rollno) {
	this.rollno = rollno;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getMarks() {
	return marks;
	}
	public void setMarks(int marks) {
	this.marks = marks;
	}

	public Student() {

	}
	public Student(int rollno, String name, int marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
	}

	@Override
	public String toString() {
	return rollno+" "+name+" "+marks;
	}
	@Override
	public int compareTo(Student o) {
		return o.rollno-this.rollno;
	}

	/*
	 * @Override public int compareTo(Object o) { return (o(Student)).rollno-this.rollno; }
	 */
	
	
}
