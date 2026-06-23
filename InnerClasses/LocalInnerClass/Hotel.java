public class Hotel{
	private int totalRooms;
	private String name;
	private int reservedRooms; 
	public Hotel(int totalRooms, String name, int reservedRooms){
		this.totalRooms=totalRooms;
		this.name=name;
		this.reservedRooms=reservedRooms;
	}
	public void reserveRoom(String guestName, int numberOfRooms){
		class Validator{
			public boolean isValid(){
				if(guestName==null || guestName.isEmpty()){
					System.out.println("Invalid guest name.");
					return false;
				}
				if(numberOfRooms<=0){
					System.out.println("Invalid number of rooms.");
					return false;
				}
				if(reservedRooms+numberOfRooms>totalRooms){
					System.out.println("Not enough rooms available.");
					return false;
				}
				return true;
			}
		}
		Validator validator=new Validator();
		if(validator.isValid()){
			reservedRooms+=numberOfRooms;
			System.out.println("Reserved " + numberOfRooms + " rooms for " + guestName);
		}
		
	}
}