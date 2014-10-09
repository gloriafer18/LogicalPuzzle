/**
 * 
 */
package com.sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.*;
import com.sample.DroolsTest.Message;

import org.kie.api.runtime.rule.FactHandle;


/**
 * @author Asistente
 *
 */
public class IniciarJuego {
	
	public static IniciarJuego iniciajuego;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties puzzle = new Properties();
		InputStream in = IniciarJuego.class.getResourceAsStream("puzzle.properties");
		
		 Celda[][][] cubo = new Celda[4][4][4];
		 
		 //char[][][] valores = new char[4][4][4];
		 //Celda objPuzzle = new Celda();
		 
		 //Dominio 1
		 
		 String[] instancias_D1 = new String[4];
	     String[] instancias_D2 = new String[4];
	     String[] instancias_D3 = new String[4];
		
		try {
			//CARGAMOS LOS DATOS DEL LOGICAL PUZZLE
	        puzzle.load(in);
	        //Defino los dominios según el archivo .properties
	        String D1=puzzle.getProperty("Dominio1");//
	        String D2=puzzle.getProperty("Dominio2");
	        String D3=puzzle.getProperty("Dominio3");
	        
	        //Instancias de cada dominio	        
	        instancias_D1[0] = puzzle.getProperty("i1d1");
	        instancias_D1[1] = puzzle.getProperty("i2d1");
	        instancias_D1[2] = puzzle.getProperty("i3d1");
	        instancias_D1[3] = puzzle.getProperty("i4d1");
	        instancias_D2[0] = puzzle.getProperty("i1d2");
	        instancias_D2[1] = puzzle.getProperty("i2d2");
	        instancias_D2[2] = puzzle.getProperty("i3d2");
	        instancias_D2[3] = puzzle.getProperty("i4d2");
	        instancias_D3[0] = puzzle.getProperty("i1d3");
	        instancias_D3[1] = puzzle.getProperty("i2d3");
	        instancias_D3[2] = puzzle.getProperty("i3d3");
	        instancias_D3[3] = puzzle.getProperty("i4d3");
	        
	        //Clues
	        String C1=puzzle.getProperty("Clue1");
	        String C2=puzzle.getProperty("Clue2");
	        String C3=puzzle.getProperty("Clue3");
	        String C4=puzzle.getProperty("Clue4");
	        
/*	        //Imprime los valores del archivo .properties
	        for (String key : puzzle.stringPropertyNames()) {
                String value = puzzle.getProperty(key);
                System.out.println("Key:- " + key + " Value:- " + value);
            }*/	        
	        	        
	        //Instanciamos la clase celda
	        
	        //Celda celda=new Celda();
	        
	        
	        //CARGAMOS LA BASE DE CONOCIMIENTO 
	        //GO	        
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	//Setting s000 = new Setting(0, 0,0, '-');
	        //FactHandle fh000 = kSession.insert(s000);
	        //this.create();
			
			
			//1. INICIALIZAMOS LAS CELDAS VACIAS 
	        for (int fil=0; fil < 4; fil ++){//Este for representa la filas ----- Dominio1
	        	for (int col=0; col < 4; col ++){ //Este for representa las columnas --- Dominio2
	        		for (int prof=0; prof< 4; prof ++){//Este for representa las filas --- Dominio3
	        	        //numCol=new CellCol(col);			
	        			//numRow=new CellRow(fil);
	        			//numprof=new CellProf(prof);
	        			//celda.setValue('-');
	        			//instancia de una celda
	        			Celda c=new Celda(fil, col,prof,instancias_D1[fil],instancias_D2[col], instancias_D3[prof]);
	        			cubo[fil][col][prof]= c;	        			
	        			//System.out.println(numbers[prof][col][fil]= '-');
	        			//Este objeto define el valor de una celda
	        			kSession.insert(c);	        			
	        			//Todas se inicializan vacias
	        		} //Cierra for profundidad
	        	}//Cierra for columna
	        }//Cierra for fila
	        
	        
	        
	        //VALIDAR CLUE1
	        
	    	//System.out.println("2.) ANALIZAMOS LOS CLUES");
	        //Es necesario partir la cadena con la clave para identificar (Revidar documento): 
	        //Dc = Dominio de Comparación
	        //Dd = Dominio de la Derecha
	        //Di = Dominio de la Izquierda
	        //id = Instancia de la derech
	        //ii = Instacia de la izquierada

	        
	        //Igualdad
	        
	        StringTokenizer tokensc1 = new StringTokenizer(C1, "==");
	        while(tokensc1.hasMoreTokens()){
	        	System.out.println(tokensc1.nextToken());
	        }
	        
	        
	        //VALIDAR CLUE2
	        //Comparación	        
	        StringTokenizer tokensc2 = new StringTokenizer(C2,"<");
	        
	        //VALIDAR CLUE3
	        //Dinjunto
	        
	        StringTokenizer tokensc3 = new StringTokenizer(C3);
	        
	        //VALIDAR CLUE34
	        //Comparacion Menor	        
	        StringTokenizer tokensc4 = new StringTokenizer(C4);

	        
	        
	        
	        //kSession.delete(fh000);	        
            kSession.fireAllRules();
            in.close();
            
	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	}

}
