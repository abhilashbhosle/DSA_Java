
public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 9};
       int ans= printMax(arr,0);
	   System.out.println(ans);
    }
    static int printMax(int[] arr,int index) {
		if(index==arr.length-1){
			return arr[index];
		}
		int mia= printMax(arr, index+1);
		if(arr[index]>mia){
			return arr[index];
		}else{
			return mia;
		}
    }

}
