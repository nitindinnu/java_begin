import java.util.Scanner;

public class mini_proj_13 {
    public static void main(String[] args) {
        float a,b;
        System.out.println("enter a");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        System.out.println("enter b");
        Scanner sc = new Scanner(System.in);
        b = sc.nextFloat();

        // System.out.println(a);
        // System.out.println(b);
        System.out.println("you entered " + a + " and " + b);

        String prompt = "enter 1 to add,2 to substract,3 to multiply,4 to divide";
        System.out.println(prompt);


        int input = scan.nextInt();
        switch (input){
            case 1:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(a + b);
                break;

            case 2:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(a -b);
                break;

            case 3:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(a *b);
                break;

            case 4:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(a/b);
                break;

            default:
                System.out.println("Invalid input");

        }
    }
}