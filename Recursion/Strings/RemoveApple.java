public class RemoveApple{
	public static void main(String[] args) {
		String unfiltered="bcapplekl";
		String ans=skip(unfiltered);
		System.out.println(ans);
	}
	static String skip(String unf){
		if(unf.isEmpty()){
			return "";
		}
		if(unf.startsWith("apple")){
			return skip(unf.substring(5));
		}else{
			return unf.charAt(0)+skip(unf.substring(1));
		}
	}

}