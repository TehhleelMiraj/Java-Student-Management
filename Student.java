package miniProjectWeek1;

public class Student {
String name;
int age;
int rollno;


public Student(String n,int a, int r) {
	this.name=n;
	this.age=a;
	this.rollno=r;
	
}

public void ShowInfo() {
	
	System.out.println("Name :"+name+" |Age :"+age+" |Roll no :"+rollno);
}
}
