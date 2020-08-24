import java.util.Scanner;

public class takinginput4{ //taking user input & if else
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter string :");
        String input1 = scan.nextLine();
        // String input = scan.next(); //i/p:Hello welcome  o/p:Hello | next() count whitespaces as end
        
        System.out.println("enter integer :");
        int input2 = scan.nextInt();
        
        System.out.println(input1);
        System.out.println(input2);
    }
} 