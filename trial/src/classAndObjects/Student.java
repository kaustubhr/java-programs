package classAndObjects;

public class Student {
	
	String name;
	Student(){
		this.name = "Unknown";
	}
	Student(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		Student s1 = new Student("Kaustubh");
		Student s2 = new Student();
		System.out.println(s1.name);
		System.out.println(s2.name);
		

	}

}
