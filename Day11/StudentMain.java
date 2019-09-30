package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentMain {
	public static void main(String[] args) {

			Student studentDivyanshu=new Student(1, "DIVYANSHU", 91);

			List<Student> studList=new ArrayList<>();


			studList.add(studentDivyanshu);
			studList.add(new Student(2, "Prateek", 96));
			studList.add(new Student(31, "ateeq", 91));
			studList.add(new Student(41, "Pratiksha", 90));
			studList.add(new Student(5, "Prerna", 80));


			Iterator<Student> stuItr= studList.iterator();

			while(stuItr.hasNext())
			{
			Student stu=stuItr.next();

			System.out.println(stu.getName());

			}
			Collections.sort(studList);

			}

			}


