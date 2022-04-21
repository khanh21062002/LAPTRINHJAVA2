package First;
import java.util.Scanner;
public class thoikhoabieu {
    public static void main(String[] args){
        int day;
        Scanner a = new Scanner(System.in);
        System.out.println("nhap thu trong tuan");
        day = a.nextInt();
        switch(day){
            case 2 : System.out.println("Thu 2: khong co lich hoc");break;
            case 3 : System.out.println("Thu 3: XLTHS LTTT TA");break;
            case 4 : System.out.println("Thu 4: DTS KTSCT TA");break;
            case 5 : System.out.println("Thu 5: KNTLVB TTHCM");break;
            case 6 : System.out.println("Thu 6: khong co lich hoc");break;
            case 7 : System.out.println("Thu 7: khong co lich hoc");break;
            case 8 : System.out.println("Thu CN: khong co lich hoc");break;
            default: System.out.println("nhap thu khong hop le");
        }
    }
}
