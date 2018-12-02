
public class Student {
	private String name;
	private int age;
	
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
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Student) {
			Student student = (Student)obj;
			if (this.name.equals(student.name) && this.age == student.age) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return this.name + "-" + this.age;
	}
	
	
}
