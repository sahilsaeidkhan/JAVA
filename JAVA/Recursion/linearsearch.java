// Check Whether the Target element exist in the array or not 

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1,5,2,6,3,7};
        int target = 57;
        int index = 0;
        System.out.println(find(arr,target,index));
    }
    public static boolean find(int[]arr , int target , int index){
        if ( index == arr.length){
            return false;
        }
        return arr[index] == target || find ( arr, target , index+1);
    }
}
