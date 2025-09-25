public class pattern {
    public static void main(String[] args) {
        int r = 5;
        int c = 6;
        triangle(r,c);
    }
    public static void triangle(int r, int c){
        if ( r == 0){
            return;
        }
        if ( c>0){
            System.out.print("*");
            triangle(r,c-1);
        }
       
        else {
             System.out.println();
            triangle( r - 1 , r-1);
        }
    }
}
