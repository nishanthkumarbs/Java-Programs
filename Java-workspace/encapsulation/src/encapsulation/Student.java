package encapsulation;

public class Student {
	private String sname;
	private int usn;
	private String branch;
	
	public String get_sname() {
		return this.sname;
	}
	public int get_usn() {
		return this.usn;
	}
	public String get_branch() {
		return this.branch;
	}
	public void set_sname(String sname) {
		this.sname = sname;
	}
	public Student(String sname, int usn, String branch) {
		this.sname = sname;
		this.usn = usn;
		this.branch = branch;
	}

}
