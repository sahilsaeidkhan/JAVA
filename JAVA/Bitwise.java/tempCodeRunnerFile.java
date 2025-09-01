    // Reset the ith bit 
    public class resetbit {
        public static void main(String[] args) {
            int n =4;
            System.out.println(reset(n));
        }
        static int reset(int n){
            return  ( n & ~ ( 1<<(4-1) ));
        }
    }
