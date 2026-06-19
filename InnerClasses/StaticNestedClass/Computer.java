public class Computer{
	private String brand;
	private String model;
	private OperatingSystem os;

	public Computer(String brand, String model, String osName){
		this.brand=brand;
		this.model=model;
		this.os=new OperatingSystem(osName); 
	}
	public static class USB{
		public void connect(){
			System.out.println("USB device connected.");
		}
	}
	public OperatingSystem getOperatingSystem(){
		return os; 
	}
	 public class OperatingSystem{
		private String osName;

		public OperatingSystem(String osName){
			this.osName=osName;
		}

		public void displayInfo(){
			System.out.println("Computer: " + brand + " " + model);
			System.out.println("Operating System: " + osName);
		}
	}

}