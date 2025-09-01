public class unique {
    public static void main(String[] args){
        int[] uniqueno = {3,5,3,6,7,7,1,5,6};
        System.out.println(unique(uniqueno));
    }
    static int unique(int[] uniqueno){
           int sum = 0;
        for ( int i = 0 ; i<uniqueno.length;i++){
            sum = sum ^ uniqueno[i];
        } 
         return sum;
    }  
}