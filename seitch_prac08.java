import java.util.Scanner;

public class seitch_prac08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int inp = sc.nextInt();
        switch (inp) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;        
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satureday");
                break;  
            case 7:
                System.out.println("Sunday");
                break;      
        
            default:
                 System.out.println("enter value b/w 1 to 7");
                break;
        }
    }
}