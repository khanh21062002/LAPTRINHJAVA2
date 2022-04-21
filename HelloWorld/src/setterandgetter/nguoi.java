package setterandgetter;

public class nguoi {
    public static void main(String[] arg){
        Person a = new Person("Khanh",21, 1.7f);
        System.out.println(a.getAge());
        a.setAge(22);
        System.out.println(a.getAge());
        a.setAge(-5);
        System.out.println(a.getAge());
    }
}
