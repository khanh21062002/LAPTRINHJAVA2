package First;
import java.util.Scanner;
public class tong2so {
    public static void main(String[] args){
        int a,b;
        Scanner x = new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        a = x.nextInt();
        System.out.println("nhap so thu hai: ");
        b = x.nextInt();
        System.out.println("tong 2 so la : " + (a+b));
        if (a>b){
            System.out.println("so thu nhat lon hon so thu hai");
        }
        else{
            System.out.println("so thu hai lon hon so thu nhat");
        }
    }
}
