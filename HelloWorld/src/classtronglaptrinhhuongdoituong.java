public class classtronglaptrinhhuongdoituong {
	public static void main(String[] args) {
		Person1 a = new Person1();
		a.name = "Chau";
		a.age = 21;
		a.height = 1.7f;
		
		a.eat("Rice");
		int age = a.getAge();
		System.out.println("His age:"+age);
	}
}