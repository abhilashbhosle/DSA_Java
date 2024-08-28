public class CharSearch{
	public static void main(String[] args) {
		String str="Abhilash";
		char c='l';
		int ans= Search(str, c);
		System.out.println(ans);

		boolean ansForEach=SearchForEach(str, c);
		System.out.println(ansForEach);
	}
	static int Search(String str, char c){
		if(str.length()==0){
			return -1;
		}
		for(int i=0;i<str.length();i++){
			if(c==str.charAt(i)){
				return i;
			}
		}
		return -1;
	}
	// USING FOR EACH
	static boolean SearchForEach(String str,char c){
		if(str.length()==0){
			return false;
		}
		for(char ch: str.toCharArray()){
			if(ch==c){
				return true;
			}
		}
		return false;
	}
}