package domain;

public class Cochera {
	
	private char piso;
	private int numeroCochera;
	
	public char getPiso() {
		return piso;
	}
	public void setPiso(char piso) {
		this.piso = piso;
	}
	public int getNroCochera() {
		return numeroCochera;
	}
	public void setNumeroCochera(int numeroCochera) {
		this.numeroCochera = numeroCochera;
	}
	
	public Cochera(char col, int numeroCochera){
		this.setPiso(col);
		this.setNumeroCochera(numeroCochera);
	}
	
	/*
	@Override
	public int hashCode(){
		return Character.hashCode(getCol())*Integer.hashCode(getFila());
		
	}
	
	
	@Override
	public boolean equals (Object pos){
		return (pos instanceof Position 
				&& this.getCol()==((Position)pos).getCol() 
				&& this.getFila()==((Position)pos).getFila());
	}
	*/
}
