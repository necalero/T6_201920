package model.logic;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

import model.data_structures.DoublyLinkedList;
import model.data_structures.HashTableLinearProbing;
import model.data_structures.HashTableSeparateChaining;
import model.data_structures.Nodo;
import model.data_structures.TravelTime;
import model.data_structures.UBERTrip;


/**
 * Definicion del modelo del mundo
 *
 */
public class MVCModelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private HashTableLinearProbing datosLP;
	private HashTableSeparateChaining datosSC;

	//-----------------------------------------------------------------

	/**
	 * Constructor del modelo del mundo
	 */
	public MVCModelo()
	{
	}

	

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 * @throws IOException 
	 * @throws NoExisteException 
	 */
	@SuppressWarnings("unchecked")
	public void cargar(int trimestre) throws IOException, NoExisteException
	{	
		CSVReader reader;
		boolean x =false;
		for(int i = 0; i< 4&&!x;i++)
		{
			if(trimestre==i)
			{
				FileReader fr = new FileReader("./data/bogota-cadastral-2018-"+i+"-WeeklyAggregate.csv");
				reader = new CSVReader(fr);
				String [] nextLine=reader.readNext();
				while (nextLine != null) 
				{
					String key = trimestre+"-"+nextLine[0]+"-"+nextLine[1];
					datosLP.put(key, (Comparable) new Nodo(new UBERTrip(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5], nextLine[6])));
					datosSC.put(key, (Comparable) new Nodo(new UBERTrip(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5], nextLine[6])));
					nextLine = reader.readNext();
				}
				reader.close();
				x = true;
			} 
			
		}
		if(x==false)
		{
			throw new NoExisteException("Ingrese un trimestre valido.");
		}
		

	}



}