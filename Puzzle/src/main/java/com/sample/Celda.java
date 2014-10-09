package com.sample;

import java.util.Set;
import com.sample.*;


public class Celda {
		public static final char FALSO = 'X';
		public static final char HECHO = 'O';
		public static final char VACIA = '-';
		
		private char  value =' '; //Representa el valor de la celda
	    private CellRow   cellRow; // Representa el indice de la fila
	    private CellCol   cellCol; // Representa el indice de la Columna
	    private CellProf cellProf;  // Representa el indice de la profundidad
		
	    
	    public char getValue() {

			return value;
		}
		public void setValue(char value) {
			this.value = value;
		}
		public CellRow getCellRow() {
			return cellRow;
		}
		public void setCellRow(CellRow cellRow) {
			this.cellRow = cellRow;
		}
		public CellCol getCellCol() {
			return cellCol;
		}
		public void setCellCol(CellCol cellCol) {
			this.cellCol = cellCol;
		}
		
		
		public CellProf getCellProf() {
			return cellProf;
		}
		public void setCellProf(CellProf cellProf) {
			this.cellProf = cellProf;
		}
		
		//METODOS
		
		public void makeReferences(CellRow row, CellCol col, CellProf prof) {
	        this.cellRow = row;
	        this.cellCol = col;
	        this.cellProf = prof;	        
	    }		
}
