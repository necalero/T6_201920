package controller;

import java.util.Scanner;

import model.logic.MVCModelo;
import view.MVCView;

public class Controller {

	/* Instancia del Modelo*/
	private MVCModelo modelo;

	/* Instancia de la Vista*/
	private MVCView view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new MVCView();
		modelo = new MVCModelo();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option)
			{
			case 1:
				view.printMessage("Se estan cargando los viajes: ");
				modelo = new MVCModelo();
				view.printMessage("Ingrese el numero de trimestre a cargar: (1 o 2)");
				int trimestre=lector.nextInt();
				
				try
				{
					modelo.cargar(trimestre);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;

			case 2:
				view.printMessage("Generar muestra de n elementos:");
				view.printMessage("Ingrese el tamaño de la muestra");
				int n=lector.nextInt();
				

				
				
				

			default: 
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;
				
			}
		}

	}	
}
