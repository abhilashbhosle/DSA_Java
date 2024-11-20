
import java.util.Arrays;


public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int start = 0;
        int end = nums.length;
        sort(nums, start, end);
		System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        sort(nums, start, mid);
        sort(nums, mid, end);
		mergeSort(nums,start,end,mid);
    }
	static void mergeSort(int[] nums,int start,int end,int mid){
		int[] mix=new int[end-start];
		int i=start;
		int j=mid;
		int k=0;

		while(i<mid && j<end){
			if(nums[i]>nums[j]){
				mix[k]=nums[j];
				j++;
				k++;
			}else{
				mix[k]=nums[i];
				i++;
				k++;
			}
		}
		while(i<mid){
			mix[k]=nums[i];
			i++;
			k++;
		}
		while(j<end){
			mix[k]=nums[j];
			j++;
			k++;
		}
		for(int l=0;l<mix.length;l++){
			nums[start+l]=mix[l];
		}
	}
}
