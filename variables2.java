public class variables2 {
    public static void main(String[]args) {
        // String name = "Nitin";
        // System.out.println(name);
        /*
        int a = 10,x=9;
        float b = 55.55f;
        boolean isAdult = false;
        */
        String name = "Nitin";
        String hello ="to Java";
        /*
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(isAdult);
        */
        /* rules for creating variables
          1) must start with letter only ,next can have digits,dollarsign,underscore
          2)JaVA is a case sensitive nitin and Nitin are two diff variables
          3) shouldnt use whitespaces
          4) cant use reverse keyword from java
        */
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name + " welcome " + hello);
        System.out.println(name + " welcome\\ " + hello);// [special escape sequence char are \\,\",\n,\t]
        System.out.println(name.contains("Nit")); //returns true if nit exists in name
        System.out.println(name.charAt(0));
        System.out.println(name.endsWith("in"));
        System.out.println(name.indexOf("rin")); //-1 if not found
    }
}