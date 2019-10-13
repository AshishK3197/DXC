package StudentDetails;

import java.util.ArrayList;

public class StudentService {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();
		ArrayList<Student> studs = dao.getStudByRnoSname(108, "ASHU");

		for (Student stud : studs) {
			System.out.println(stud);

		}
	}
}
