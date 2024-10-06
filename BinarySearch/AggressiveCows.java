
import java.util.Arrays;

public class AggressiveCows{
	public static void main(String[] args) {
		int[] position={5,4,3,2,1,1000000000};
		int m=2;
		Arrays.sort(position);
		int ans = maxDistance( position,m); 
		System.out.println(ans);

	}
	static int maxDistance(int[] position, int m) {
		int low=1;
		int high=position[position.length-1]-position[0];
		while(low<=high){
			int mid=(high+low)/2;
			boolean findTheMax=findMax(position,m,mid);
			if(findTheMax){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return high;
    }
	static boolean findMax(int[] position,int m,int mid){
		int lastIndex=position[0];
		int count=1;
		for(int i=1;i<position.length;i++){
			if(position[i]-lastIndex>=mid){
				count++;
				lastIndex=position[i];
			}
		}
		return count>=m;
	}
}