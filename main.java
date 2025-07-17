package miniProjectWeek1;
import java.util.*;
public class main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students=new ArrayList<>();
		
		System.out.println("How many Students Do You Want To Add?");
		int total = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=total; i++) {
			System.out.println("Add Student Detail"+i);
			
			System.out.println("Enter The Student Name :");
			String name =sc.nextLine();
			
			System.out.println("Enter The Student Age :");
			int age=sc.nextInt();
			System.out.println("Enter The Student Roll No :");
			int rollno=sc.nextInt();
			sc.nextLine();
			
			Student s = new Student(name,age,rollno);
			students.add(s);
			
		}
		System.out.println("\n All Students");
		for(Student s:students) {
			s.ShowInfo();
		}
		sc.close();
		
		
		
		
		
		
		
	}

}
