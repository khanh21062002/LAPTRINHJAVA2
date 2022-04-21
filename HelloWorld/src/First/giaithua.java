package First;

import java.util.Scanner;

public class giaithua {
    public static void main(String[] args){
        int num, giaithua = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so can tinh giai thua: ");
        num = s.nextInt();
        System.out.print("giai thua cua "+ num +" la : ");
        while (num >= 1){
            giaithua*=num;
            num--;
        }
        System.out.println(giaithua);
    }
}
