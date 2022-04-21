package First.baitapchuong1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        String choose ;
        Scanner s = new Scanner(System.in);
        System.out.println("hello player! Please choose the options of the game");
        System.out.println("(A)dd a new player");
        System.out.println("(L)oad a saved game");
        System.out.println("(S)ave game");
        System.out.println("(Q)uit game");
        choose = s.nextLine();
        System.out.println("Your choice: "+ choose);
        switch(choose){
            case "A": System.out.println("(A)dd a new player");break;
            case "a": System.out.println("(A)dd a new player");break;
            case "L": System.out.println("(L)oad a saved game");break;
            case "l": System.out.println("(L)oad a saved game");break;
            case "S": System.out.println("(S)ave game");break;
            case "s": System.out.println("(S)ave game");break;
            case "Q": System.out.println("(Q)uit game");break;
            case "q": System.out.println("(Q)uit game");break;
            default : System.out.println("error"); 
        }
    }
}

