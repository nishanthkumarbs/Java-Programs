package Object_programs;

public class Student {
	String sname;
	int regno;
	float percentage;
	
	public Student(String sname,int regno,float percentage) {
		this.sname = sname;
		this.regno = regno;
		this.percentage = percentage;
		
	}
	public static void main(String[] args) {
		Student s1 = new Student("Nishanth", 111, 80);
		Student s2 = new Student("Kumar", 222, 85);
		Student s3 = new Student("Nikhil", 333, 75);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
	}

}
