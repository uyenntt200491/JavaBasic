package object;

public class Student {
	// tao thuoc tinh
	private int id;
	private String name;
	private int age;
	private String address;
	
	
// ham tao
	public Student (String name)
	{
		System.out.println("name of student : " + name);
	}
	
	
	
	public static void main (String[] args)
	{
		 
		Student student = new Student("Nguyen Van A");
		
	}
}
