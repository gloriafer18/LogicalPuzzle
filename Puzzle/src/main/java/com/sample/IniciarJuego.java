/**
 * 
 */
package com.sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;


/**
 * @author Asistente
 *
 */
public class IniciarJuego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties puzzle = new Properties();
		InputStream in = IniciarJuego.class.getResourceAsStream("puzzle.properties");
		 char[][][] numbers = new char[4][4][4];
		
		try {
	        puzzle.load(in);
	        //Defino los dominios según el archivo .properties
	        String D1=puzzle.getProperty("Dominio1");
	        String D2=puzzle.getProperty("Dominio2");
	        String D3=puzzle.getProperty("Dominio3");
	        
	        //Instancias de cada dominio	        
	        String i1d1 = puzzle.getProperty("i1d1");
	        String i2d1 = puzzle.getProperty("i2d1");
	        String i3d1 = puzzle.getProperty("i3d1");
	        String i4d1 = puzzle.getProperty("i4d1");
	        String i1d2 = puzzle.getProperty("i1d2");
	        String i2d2 = puzzle.getProperty("i2d2");
	        String i3d2 = puzzle.getProperty("i3d2");
	        String i4d2 = puzzle.getProperty("i4d2");
	        String i1d3 = puzzle.getProperty("i1d3");
	        String i2d3 = puzzle.getProperty("i2d3");
	        String i3d3 = puzzle.getProperty("i3d3");
	        String i4d3 = puzzle.getProperty("i4d3");
	        
	        //Clues
	        String C1=puzzle.getProperty("Clue1");
	        String C2=puzzle.getProperty("Clue2");
	        String C3=puzzle.getProperty("Clue3");
	        String C4=puzzle.getProperty("Clue4");
	        
	        //Imprime los valores del archivo .properties
	        for (String key : puzzle.stringPropertyNames()) {
                String value = puzzle.getProperty(key);
                System.out.println("Key:- " + key + " Value:- " + value);
            }
	        
	        //Llenar el tablero con los datos
	        
	        for (int prof=0; prof < 4; prof ++){//Este for representa la profundidad
	        	for (int col=0; col < 4; col ++){ //Este for representa las instancias de cada dominio
	        		for (int fil=0; fil< 4; fil ++){//Este for representa el valor de cada celda
	        			numbers[prof][col][fil]= '-';
	        			
	        		} //Cierra for Valor	        		
	        	}//Cierra for instancia
	        }//Cierra for dominio
	        
	        //Identificar los elementos de cada clave
/*	        if(){
	        	 C1 = C1.substring(C1.indexOf(sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	        	
	        }*/
	        

	        in.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	}

}
