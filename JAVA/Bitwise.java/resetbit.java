    // Reset the ith bit 
    public class resetbit {
        public static void main(String[] args) {
            int n =13;
            System.out.println(reset(n));
        }
        static int reset(int n){
            return  ( n & ~ ( 1<<(3) ));
        }
    }
