package com.sample;

public class Clue {

	private String  Dc; //Dominio de COmparacion
    private String   Di; // Dominio Izquierda
    private String Ii; // Instancia Izquierda
    private String Operador;  // <> o & == valor de comparación
    private int parametro; //número
    private String Dd; //
    private String Id; //
    

	

	public String getDc() {
		return Dc;
	}

	public Clue(String dc, String di, String ii, String O, int par, String dd, String id) {
		this.Dc=dc;
		this.Di=di;
		this.Ii=ii;
		this.Operador=O;
		this.parametro=par;
		this.Dd=dd;
		this.Id=id;		
	}


	public void setDc(String dc) {
		Dc = dc;
	}




	public String getDi() {
		return Di;
	}




	public void setDi(String di) {
		Di = di;
	}




	public String getIi() {
		return Ii;
	}




	public void setIi(String ii) {
		Ii = ii;
	}




	public String getOperador() {
		return Operador;
	}




	public void setOperador(String operador) {
		Operador = operador;
	}




	public int getParametro() {
		return parametro;
	}




	public void setParametro(int parametro) {
		this.parametro = parametro;
	}




	public String getDd() {
		return Dd;
	}




	public void setDd(String dd) {
		Dd = dd;
	}




	public String getId() {
		return Id;
	}




	public void setId(String id) {
		Id = id;
	}




	public Clue() {
		// TODO Auto-generated constructor stub
	}

}
