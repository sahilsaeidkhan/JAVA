package JAVA;
public class doublet {
    public static void main(String[] args) {

        int[] nums = {2,4,6,4,7,5};
        int target = 10;
        int found = 0;
        leetcode(nums , target , found);   
    }
       public static void leetcode(int [] nums , int target , int found){
         for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" + "+nums[j]+" = "+target);
                    found++;
                }
            }   
            if (found ==1){
                    break;
                }   
        }
    }
}
