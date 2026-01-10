package encapsulation;

public class Student_driver {

	public static void main(String[] args) {
		Student s = new Student("Nishanth",21066,"CSE");
		System.out.println(s.get_sname());
		System.out.println(s.get_usn());
		System.out.println(s.get_branch());
		System.out.println("---------------------");
		s.set_sname("Nishanth Kumar");
		System.out.println("---------------------");
		System.out.println(s.get_sname());
		System.out.println(s.get_usn());
		System.out.println(s.get_branch());
	}
}
