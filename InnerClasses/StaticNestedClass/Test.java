public class Test{
	public static void main(String[] args) {
		Computer computer=new Computer("Dell", "XPS 15", "Windows 10");
		computer.getOperatingSystem().displayInfo();
		Computer.USB usb=new Computer.USB();
		usb.connect();
	}
}