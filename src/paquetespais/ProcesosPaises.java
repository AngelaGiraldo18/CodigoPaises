package paquetespais;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ProcesosPaises {

	HashMap<String, ArrayList<String>> pais = new HashMap<String, ArrayList<String>>();
    
	String nomPais ="";
	 boolean registrado = false;
	public void iniciar() {
		
		System.out.println("Entra a menu");
		       
					String menu= "VIAJE\n";
					menu+= "1. registrar Paises\n";
					menu+= "2. buscar pais y su respectiva ciudades\n";
					menu+= "3. buscar ciudades y su respectivo pais\n";
					menu+= "4. salir\n";
					menu+= "INGRESE NUMERO";
					
					int opc=0;
					do {
					  opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
						validarOpcion(opc,registrado);
					}while(opc!=4);
	}

	 private void validarOpcion(int opc, boolean registrado) {
		 System.out.println("entra a ValidarOpcion");
		    
			switch (opc) {
	        case 1:
	            registrado = true;
	            registrar();
	            break;
	        case 2:
	            if (registrado) {
	                buscarPais();
	            } else {
	                System.out.println("Primero debes registrar los países.");
	            }
	            break;
	        case 3:
	            if (registrado) {
	                buscarCiudad();
	            } else {
	                System.out.println("Primero debes registrar los países.");
	            }
	            break;
	        case 4:
	            System.out.println("Chao!");
	            break;
	        default:
	            System.out.println("No existe el código!");
	            break;
	    }
	 }
	
      public void registrar() {
			System.out.println("entra a registrar");
			int n = Integer.parseInt(JOptionPane.showInputDialog("A cuantos paises desea ir"));
			 
			 for (int i = 0; i < n; i++) {
				 nomPais = JOptionPane.showInputDialog("ingrese el nombre del pais que desea ir  ");
				 int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de ciudades a registrar a el pais "+nomPais));
				
				 ArrayList<String> ciudad = new ArrayList<>();
				 
				 for (int j = 0; j < cant; j++) {
				 ciudad.add(JOptionPane.showInputDialog("ingrese la ciudad del pais "+ nomPais));
				 }
				 
				 pais.put(nomPais,ciudad);
		}
			 
			 
				 System.out.println(pais);
			
		
			
			registrado = true;
	}
	 
	 

	private void buscarPais() {
	  System.out.println("entra a buscar pais");
	  String nombrePais = JOptionPane.showInputDialog("ingrese el pais a buscar");

	if (pais.containsKey(nombrePais)) {
		System.out.println(nombrePais+" = "+pais.get(nombrePais));
	}else {
		System.out.println("No se encontro el pais");
	}
		
	}
	
	private void buscarCiudad() {
	System.out.println("entra a buscar ciudad");
	  String ciudadConsulta = JOptionPane.showInputDialog("Ingrese la ciudad a consultar");	
		
}


}
