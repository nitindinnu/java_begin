public class arrays_11 {
    public static void main(String[] args) {
        // int[] marks ={1,2,3,4,5};
        // marks[3] =44 ; //to update array values
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        
        //classical way to iterate an array
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);  //to print array values
        // }

        //for each loop
        // for(int value:marks){
        //     System.out.println(value);
        // }

        //2d array 
        // int [][] matrix = {{1,2,3},{3,4,5}};
        // System.out.println(matrix[1][1]);
        
        //string array   
        String [] cars ={"kia","maruthi","datsun","tyota","ford"};
        for (String value:cars){
            System.out.println(value);
        }

    }
}