public class try_catch_11 {
    //try - catch

    public static void main(String[] args) {
        String [] cars ={"kia","maruthi","datsun","tyota","ford"};
        try{
        System.out.println(cars[5]);
        }
        catch (Exception e) {
            //TODO: handle exception 
            System.out.println(e);
        }
        System.out.println("hello"); //TODO:hello
}