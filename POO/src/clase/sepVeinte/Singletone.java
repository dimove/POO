package clase.sepVeinte;

public class Singletone {
	private static Singletone single;
	
	public static Singletone getObject(){
		if(single == null){
			single = new Singletone();
		}
		
		return single;
	}
	
	private Singletone(){
		
	}
}
