package First.baitapchuong1;
import java.util.Scanner;
public class bai3 {
    public static int age;
    public static void ageCheck(){
        Scanner x = new Scanner(System.in);
        System.out.println("enter your age: ");
        age = x.nextInt();
        if (age <18){
            System.out.println("khong hop le");
        }
        else{
            System.out.println("hop le");
        }
    }
    public static void main(String[] args){
        ageCheck();
    }
}
