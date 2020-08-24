import java.util.Scanner;

public class switch_stmnt7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = sc.nextInt();
        switch (inp) {
            case 10:
                 System.out.println("you are 10 years old");
                 break;
            case 5:
                 System.out.println("you are 5 years old");     
                
                break;
        
            default:
               System.out.println("you hVENT  matched any cases");
                break;
        }
    }
} 