
import java.util.HashMap;

public class ReconstructIternary{
	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("Chennai", "Banglore");
		map.put("Bombay", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		findSource(map);
	}
	public static void findSource(HashMap<String, String> map){
		HashMap<String, Boolean> psrc= new HashMap<>();
		for(String src: map.keySet()){
			String dest=map.get(src);
			psrc.put(dest, false);
			if(psrc.containsKey(src)==false){
				psrc.put(src, true);
			}
		}
		String src="";
		for(String pot: psrc.keySet()){
			Boolean val=psrc.get(pot);
			if(val==true){
				src=pot;
			    break;
			}
		}
		while(true){
			if(map.containsKey(src)){
				System.out.print(src+"->");
				src=map.get(src);
			}
			else{
				System.out.print(src+".");
				break;
			}
		}
	}
}