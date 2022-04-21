package First.baitapchuong1;
import java.util.Scanner;
public class bai5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        show(arr);
    }
    public static void show(int[] arr) {
        int x = arr.length;
        System.out.print(x);
    }
}
