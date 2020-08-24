import java.util.Random;

public class math5 {
    public static void main(String[] args) {
        int a=5,b=20;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(b));
        System.out.println(Math.abs(-22));
        System.out.println(Math.random()); //return b/w 0 & 1

        //Min + (Math.random() * (Max - Min))
        System.out.println(5 + (Math.random() * (10 - 5))); //b/w [5,10]
        //System.out.println(8+(21-8)*Math.random()); //return b/w [8,21]

        //Min + (int)(Math.random() * ((Max - Min) + 1)) to get random int
        System.out.println(8+(int)(Math.random()*((21-8)+1))); //return b/w [8,21]
        System.out.println(8 + (int)(Math.random() * ((21 - 8) + 1))); //b/w [8,21]

        System.out.println(Math.random()* 6); //return b/w 0 & 6

        Random ran = new Random();
        int x = ran.nextInt(6) + 5;  //b/w [5,10]
        //int x = rand.nextInt(10); b/w[0,9]
    }
    
}