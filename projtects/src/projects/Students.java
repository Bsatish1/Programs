package projects;

class student
{   
	String name;
	int rollnumber;
	
	public student(String name,int rollnumber)
	{
		this.name = name;
		this.rollnumber = rollnumber;
		}
	
}
public class Students {
	
public static void main(String[] args) {
	
	student t = new student("mani",102);
	System.out.println(t.name);
	System.out.println(t.rollnumber);
	
}

}
