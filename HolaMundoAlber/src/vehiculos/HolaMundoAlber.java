package vehiculos;

import java.util.ArrayList;


public class HolaMundoAlber {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> motos = new ArrayList<String>();
		motos.add("Honda");
		motos.add("Harley");
		motos.add("Vespa");
		
		for (String m:motos) {
			System.out.println(m);
		}
		
	}
		
	
}
