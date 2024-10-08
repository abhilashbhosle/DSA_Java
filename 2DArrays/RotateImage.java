
import java.util.Arrays;


// {               
// 	{1,2,3},      
// 	{4,5,6}, 
// 	{7,8,9}
// }
// TO
// {
// 	{7,4,1},
// 	{8,5,2},
// 	{9,6,3}
// }
public class RotateImage {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RotateArr(arr);
    }

    static void RotateArr(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i<j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
           int start=0;
           int end=arr[i].length-1;
           while(start<end){
            int temp=arr[i][start];
             arr[i][start]=arr[i][end];
             arr[i][end]=temp;
             start++;
             end--;
           } 
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
