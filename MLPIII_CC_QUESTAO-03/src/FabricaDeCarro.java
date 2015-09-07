
public class FabricaDeCarro {
	private static FabricaDeCarro uniqueInstance = new FabricaDeCarro();
	private FabricaDeCarro() { 
		
	} 
	public static FabricaDeCarro getInstance() {
		return uniqueInstance; 
	} 
}

	

