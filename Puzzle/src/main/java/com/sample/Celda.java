package com.sample;

import java.util.Set;
import com.sample.*;


public class Celda {
		public static final char FALSO = 'X';
		public static final char HECHO = 'O';
		public static final char VACIA = '-';
		
		private char  value =' '; //Representa el valor de la celda
	    private int   cellRow; // Representa el indice de la fila
	    private int cellCol; // Representa el indice de la Columna
	    private int cellProf;  // Representa el indice de la profundidad
	    private String insRow;
	    private String insCol;
	    private String insProf;
	    
	    
	    
	    //Nuevas variables
	    
	    public static final int DOMINIO_1 = 0;
        public static final int DOMINIO_2 = 1;
        public static final int DOMINIO_3 = 2;
        private String dominio1;
        private String dominio2;
        private String dominio3;
                
        char[][][] cubo = new char[4][4][4];
        
        
        
	    
	    public String getInsRow() {
			return insRow;
		}
		public void setInsRow(String insRow) {
			this.insRow = insRow;
		}
		public String getInsCol() {
			return insCol;
		}
		public void setInsCol(String insCol) {
			this.insCol = insCol;
		}
		public String getInsProf() {
			return insProf;
		}
		public void setInsProf(String insProf) {
			this.insProf = insProf;
		}
		public int getCellRow() {
			return cellRow;
		}
		public void setCellRow(int cellRow) {
			this.cellRow = cellRow;
		}
		public int getCellCol() {
			return cellCol;
		}
		public void setCellCol(int cellCol) {
			this.cellCol = cellCol;
		}
		public int getCellProf() {
			return cellProf;
		}
		public void setCellProf(int cellProf) {
			this.cellProf = cellProf;
		}
		public char getValue() {

			return value;
		}
		public void setValue(char value) {
			this.value = value;
		}
		
		//METODOS
		
		public void makeReferences(int row, int col, int prof) {
	        this.cellRow = row;
	        this.cellCol = col;
	        this.cellProf = prof;	        
	    }		
		
		public Celda(int row, int col, int prof, String insr, String insc, String insp){
			this.cellRow = row;
	        this.cellCol = col;
	        this.cellProf = prof;
	        this.insRow = insr;
	        this.insCol = insc;
	        this.insProf = insp;			
	        value=this.VACIA;
		}		
}
