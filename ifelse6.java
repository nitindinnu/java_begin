import java.util.Scanner;

public class ifelse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input>20){
            System.out.println("greater than 6");
        }
        else if(input>10){
            System.out.println("greater than 10");
        }
        else{
            System.out.println("less than 10");
        }
    }
}