public interface Animal{
	public abstract void eat(); // even if we don't write public abstract, it is by default public abstract in interface
	void sleep();
	public static void run(){
		System.out.println("Animal is running");
	}
	default void walk(){
		System.out.println("Animal is walking");
		this.sleep();
	}
}