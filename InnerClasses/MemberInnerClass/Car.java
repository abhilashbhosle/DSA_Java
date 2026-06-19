public class Car{
	private String model;
	private boolean isEngineOn;
	
	public Car(String model){
		this.model=model;
		this.isEngineOn=false;
	}
	
	class Engine{
		public void start(){
			if(!isEngineOn){
				isEngineOn=true;
				System.out.println("Engine Started for " + model);
			}else{
				System.out.println("Engine is already on for " + model);
			}
		}
		public void stop(){
			if(isEngineOn){
				isEngineOn=false;
				System.out.println("Engine Stopped for" + model);
			}else{
				System.out.println("Engine is already off for" + model);
			}
		}
	}
}