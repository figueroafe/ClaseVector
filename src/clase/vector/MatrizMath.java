package clase.vector;

public class MatrizMath {
	private int fila, columna;
	private double[][] mat;
	
	
	public MatrizMath(int fila, int columna, double[][] mat) {
		this.fila = fila;
		this.columna = columna;
		this.mat = mat;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	public double getValor(int x, int y){
		return this.mat[x][y];
	}
	
	public double setValor(int x, int y, double valor){
		return this.mat[x][y] = valor;
	}
	
	
}
