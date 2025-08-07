import java.util.*;
public class TugOfWar {
    public static int mindiff=Integer.MAX_VALUE;
    public static void main(String[] args) {
         int[] nums={1,2,3,4};
         HashSet<Integer> set1=new HashSet<>();
         HashSet<Integer> set2=new HashSet<>();
         int sos1=0; // sum of set 1 ans set 2
         int sos2=0;
         getMinValue(nums,set1,set2,sos1,sos2,0);
         System.out.println(mindiff);
    }
    public static void getMinValue(int[] nums, HashSet<Integer> set1, HashSet<Integer> set2, int sos1, int sos2,int idx){
        if(idx==nums.length){
            if(Math.abs(sos1-sos2)<mindiff){
                mindiff=Math.abs(sos1-sos2);
            }
            return;
        }
        if(set1.size()<(nums.length+1)/2){
            set1.add(nums[idx]);
            getMinValue(nums,set1,set2,sos1+nums[idx],sos2,idx+1);
            set1.remove(nums[idx]);
        }
        if(set2.size()<(nums.length+1)/2){
            set2.add(nums[idx]);
            getMinValue(nums,set1,set2,sos1,sos2+nums[idx],idx+1);
            set2.remove(nums[idx]);
        }
    }
}