
import java.util.Arrays;

public class FlippingImage{
	public static void main(String[] args) {
		int[][] image={
			{1,1,0},
			{1,0,1},
			{1,0,0}
		};

		for(int[]row:image){
			for(int i=0;i<(image[0].length+1)/2;i++){
				int temp=row[i]^1;
				row[i]=row[image.length-i-1]^1;
				row[image.length-i-1]=temp;
			}
		}
		System.out.println(Arrays.deepToString(image));
	}
}