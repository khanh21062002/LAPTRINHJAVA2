package cachdungstatic;

public class tensinhvien {
    static String course;
	
	static {
		System.out.println("HowKteam");
		course = "Java core";
	}
    public static void main(String[] args) {
		student a = new student("Chau", 21, 1.7f);
		System.out.println("University (from class):" + student.universityName);
		System.out.println("University (from instance):" + a.universityName);
		
		System.out.println("Total (from class):" + student.total);
		student b = new student("Long", 24, 1.7f);
		System.out.println("Total (from instance):" + b.total);
        student.getInfoUniversity();
        System.out.println("Free education");
		System.out.println("course:"+ tensinhvien.course);
	}
}
