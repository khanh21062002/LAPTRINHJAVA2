package mypack;
public class person2 {
    public String name;
	public int age;
	public float height;
	
	public person2(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void eat(String foodName) {
		System.out.println(name + " is eating "+ foodName);
	}
	
	public int getAge() {
		return age;
	}

}
