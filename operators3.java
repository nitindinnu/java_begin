public class operators3 {
    public static void main(String[] args) {
        int num1=5,num2=6;
        System.out.print("result is \n");
        System.out.print(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2); //modulo(remainder)
        System.out.println(num1++);  //increment
        System.out.println(num1--);  //decrement
        System.out.println(++num1); 
        System.out.println(--num1);
        System.out.println(num1 += 34);  //5+34 = 39
        /*
        comparision operators
        */
        System.out.println(num1==num2);
        /*
        logical operator
        */
        System.out.println(num1>3 && num2>5); //AND:only returns true if both cases are true
        System.out.println(num1>3 || num2>5); //OR:only returns true if any cases ais true
        // System.out.println(num1>3 !! num2>5);NOT:reverse o/p if trues gives false and vice versa
    }
}