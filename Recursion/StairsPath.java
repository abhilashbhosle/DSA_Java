
import java.util.ArrayList;

public class StairsPath {
    // climibing / coming down the stairs, if we can jump 1,2,3 stairs at a time selectively.

	//  ** Note ** == If we take steps to climb like more eg; 40 the output will be time limit exceeded,
	//                since there will be number of duplicate calls increases hence here we need to apply dp/ memorization

    public static void main(String[] args) {
        ArrayList<String> ans = getPath(44);
		System.out.println(ans);
    }

    static ArrayList<String> getPath(int n) {
		if(n==0){
			ArrayList<String> reachedPath=new ArrayList<>();
			reachedPath.add("");
			return reachedPath;
		}else if(n<0){
			return new ArrayList<>();
		}
        ArrayList<String> path1 = getPath(n - 1); // paths for 1 step
        ArrayList<String> path2 = getPath(n - 2); // paths for 2 steps
        ArrayList<String> path3 = getPath(n - 3); // paths for 3 steps
		ArrayList<String> paths=new ArrayList<>();
		for(String path:path1){
			paths.add(1+path);
		}
		for(String path:path2){
			paths.add(2+path);
		}
		for(String path:path3){
			paths.add(3+path);
		}
		return paths;
    }
}
