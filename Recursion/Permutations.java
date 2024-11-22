public class Permutations{
	public static void main(String[] args) {
		String up="abc"; //unprocessed
		String p=""; // processed
		findPermutation(up,p);
	}
	static void findPermutation(String up, String p){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char c=up.charAt(0);
		for(int i=0;i<=p.length();i++){
			String f=p.substring(0,i);
			String l=p.substring(i,p.length());
			findPermutation(up.substring(1), f+c+l);
		}
	}
}