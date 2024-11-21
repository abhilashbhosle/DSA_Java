public class FancyString{
	public static void main(String[] args) {
		String s="aab";
		int count=0;
		char ch=0;
		String ans= fancy(s,count,ch);
		System.out.println(ans);
	}
	static String fancy(String s,int count,char ch){
		if(s.isEmpty()){
			return "";
		}
		if(ch==s.charAt(0)){
			count=count+1;
		}else{
			count=0;
		}
		ch=s.charAt(0);
		if(count>1){
			return fancy(s.substring(1),count,ch);
		}else{
			 return s.charAt(0)+fancy(s.substring(1),count,ch);
		}
	}
}