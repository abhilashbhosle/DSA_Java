
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Deadline{
	int time;
	int deadline;
	Deadline(int time, int deadline){
		this.time=time;
		this.deadline=deadline;
	}
}
public class JobScheduling{
	public static void main(String[] args) {
		int n=4;
		int[] t={3,1,2,5}; // time taken to perform each job
		int [] d={4,10,2,8}; // deadline to complete each job
		ArrayList<Deadline> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(new Deadline(t[i],d[i]));
		}
		Collections.sort(list, new Comparator<Deadline>(){
			public int compare(Deadline a1, Deadline a2){
				return a1.deadline-a2.deadline;
			}
		});
		// for (Deadline elem : list) {
		//    System.out.println(elem.time);
		// }

		int maxTime=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+list.get(i).time;
			if(sum>list.get(i).deadline){
				int temp=sum-list.get(i).deadline;
				maxTime=Math.max(temp, maxTime);
			}
		}
		System.out.println(maxTime);
	}
}
