
import java.util.ArrayList;

public class PartitionKSubsets{
	public static void main(String[] args){
		int n=4;
		int k=3;
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for(int i=0; i<k;i++){
			ans.add(new ArrayList<>());
		}
		int cos=0; // count of subset
		int startFrom=1;
		solution(n,k,ans,cos,startFrom);
	}
	public static void solution(int n, int k, ArrayList<ArrayList<Integer>> ans,int cos, int startNum){
		if(startNum>n){
			if(cos==k){
				for(ArrayList<Integer> list:ans){
					System.out.print(list);
				}
				System.out.println("");
			}
			return;
		}
		for(int i=0; i<ans.size(); i++){
			if(!ans.get(i).isEmpty()){
				ans.get(i).add(startNum);
				solution(n, k, ans, cos, startNum+1);
				ans.get(i).remove(ans.get(i).size()-1);
			}else{
				ans.get(i).add(startNum);
				solution(n, k, ans, cos+1, startNum+1);
				ans.get(i).remove(ans.get(i).size()-1);
				break;
			}
		}

	}
}