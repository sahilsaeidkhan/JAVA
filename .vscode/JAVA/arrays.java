import java.util.Arrays;
import java.util.Scanner; 

public class arrays {
    public static void main(String[] args) {
    
    int[] arr = new int[5];
    for (int j = 0 ; j <arr.length;j++){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
                arr[j] = sc.nextInt();

    }
    for ( int num : arr){
        System.out.print(num);
    }
    System.out.println();
   System.out.println(Arrays.toString(arr));
}}
