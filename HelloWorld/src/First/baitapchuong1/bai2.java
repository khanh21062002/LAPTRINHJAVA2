package First.baitapchuong1;
import java.util.Scanner;
public class bai2 {
    public static int sum=0,a,b;
    public static int calSum() {
        Scanner x = new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        a = x.nextInt();
        System.out.println("nhap so thu hai: ");
        b = x.nextInt();
        sum = a+b;
        System.out.println("tong 2 so la : " + sum);
        return sum;
	}
    public static void main(String[] args){
        calSum();
    }
}


