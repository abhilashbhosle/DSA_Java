public class School{
	private static School instance;
	private String name;
	private String address;

	private School(String name,String address){
		this.name=name;
		this.address=address;
	}
	public static School getInstance(){
		if(instance==null){
			instance=new School("ABC School","123 Main St");
		}
		return instance;
	}
}