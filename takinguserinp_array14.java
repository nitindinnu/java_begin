import java.util.Scanner;

public class takinguserinp_array14 {
    public static void main(String[] args) {
        // int length;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of eleemennts in array");
        int length = sc.nextInt();
        // String[] names = new String[length]; for string array
        int[] arr = new int[length]; //for int array

        for (int cont=0;cont<length;cont++){
            System.out.println("enter element "+(cont+1));
            arr[cont] = sc.nextInt();
        }
        // Input.close();

        System.out.println("your list are");
        for (int cont=0;cont<length;cont++){
            System.out.println(arr[cont]);
        }
    }
}