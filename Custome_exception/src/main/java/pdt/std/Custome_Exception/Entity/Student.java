	package pdt.std.Custome_Exception.Entity;

public class Student {

	private int id;
	private String name;
	private int age;
	private int status;
	private String error;
	
	
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Student() {
		super();
	}

	public Student(int status, String error) {
		super();
		this.status = status;
		this.error = error;
	}

	public Student(int status) {
		super();
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
