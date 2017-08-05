/**
 * 
 */
package Clases_Cesi;

/**
 * @author Cesar
 *
 */
public class Orden {


	
	private int Numero_Orden;
	private String Fecha;
	private int Cantidad;
	
	
	public Orden(int Numero_Orden, String Fecha, int Cantidad) {
		
		this.Numero_Orden=Numero_Orden;
		this.Fecha=Fecha;
		this.Cantidad=Cantidad;
		
		
	}

	public int getNumero_Orden(){
		
		
		return Numero_Orden;
		
	}

	
	public void setNumero(int Numero_Orden){
		
		this.Numero_Orden=Numero_Orden;
	
	
}
	
	public String getFecha(){
		
		return Fecha;
		
	}
	

	public void setFecha(String Fecha){
		
		this.Fecha=Fecha;
		
	}
	
	
	
	public int getCantidad(){
		
		return Cantidad;
		
	}
	
	
	public void setCantidad(int Cantidad){
		
		this.Cantidad=Cantidad;
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
