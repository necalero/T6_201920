package view;

import model.logic.MVCModelo;

public class MVCView 
{
	    /**
	     * Metodo constructor
	     */
	    public MVCView()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Cargar viajes por un trimestre seleccionado (1, 2, 3 o 4)");
			System.out.println("2. Buscar tiempos de viaje por trimestre, zona de origen y zona de destino. (Linear Probing)");
			System.out.println("3. Buscar tiempos de viaje por trimestre, zona de origen y zona de destino. (Separate Chaining)");
			
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return:");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(MVCModelo modelo)
		{
			// TODO implementar
		}
}
