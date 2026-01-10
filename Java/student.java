class student
{
	String Sname;
	int regno;
	float per;
	public student(String Sname, int regno, float per)
	{
		this.Sname = Sname;
		this.regno = regno;
		this.per = per;
	}
	public static void main(String[] args) 
	{
		student s1 = new student("sam",1,92.3f);
		student s2 = new student("ram",2,93.3f);
		student s3 = new student("naga",3,82.3f);
		System.out.println(s1.Sname+","+s1.regno+","+s1.per);
		System.out.println(s2.Sname+","+s2.regno+","+s2.per);
		System.out.println(s3.Sname+","+s3.regno+","+s3.per);
	}
}
