class Employee 
{
	static String cname = "Infosys";

	public static void work()
	{
		System.out.println("I am working in "+cname);
	}

	String ename;
	int eid;
	double sal;

	public void displayEmployeeInfo()
	{
		System.out.println("Ename= "+this.ename+" Eid= "+this.eid+" Sal= "+this.sal);
	}

	public Employee(String ename, int eid, double sal)
	{
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Sunil",111,300000);
		Employee e2 = new Employee("Shravan",222,320000);
		Employee e3 = new Employee("Yashwanth",333,350000);
		
		Employee[] ob = {e1,e2,e3};
		for (int i=0;i<3 ;i++ )
		{
			ob[i].displayEmployeeInfo();
			ob[i].work();
			System.out.println("------------------");
		}
	}
}
