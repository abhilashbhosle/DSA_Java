
public class FrogJump {
    public static void main(String[] args) {
        int n = 5;
        int[] d = {5, 3, 1, 2, 8};
        int k = 9;
		int currIdx=0;
		int minJump=0;
		while(currIdx<n){
			int nxtIdx=currIdx; 
			int currDist=0;
			while(nxtIdx+1<=n && currDist+d[nxtIdx]<=k){
				currDist+=d[nxtIdx];
				nxtIdx++;
			}
			if(nxtIdx==currIdx){
				System.out.println(-1);
			}
			currIdx=nxtIdx;
			minJump+=1;
		}
		System.out.println(minJump);
    }
}
