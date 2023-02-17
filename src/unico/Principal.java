package unico;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		String str = "";
		List<String> palabras = new ArrayList<String>();
		
		while(!str.equalsIgnoreCase("fin")) {
			str = Util.LeerString("Escriba un nombre ('Fin' para terminar):");
			if(!str.equalsIgnoreCase("fin") && !palabras.contains(str)) {
				palabras.add(str);				
			}
		}		
		
		System.out.println();
		System.out.println(palabras);
		
		
		
		
	}

}
