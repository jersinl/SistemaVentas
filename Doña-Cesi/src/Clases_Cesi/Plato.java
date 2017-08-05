/**
 * 
 */
package Clases_Cesi;

/**
 * @author Cesar
 *
 */
public class Plato {
	private int Codigo;
	
	private String Nombre;
	private String Tipo;
	private double Precio;

	public Plato(int Codigo, String Nombre, String Tipo, double Precio) {
		this.Codigo=Codigo;
		
		this.Nombre=Nombre;
		this.Tipo=Tipo;
		this.Precio=Precio;
	}

	public int getCodigo(){
		return Codigo;
	}
	
	public void setCodigo(int Codigo){
		this.Codigo=Codigo;
	}

	public String getNombre(){
		return Nombre;
	}
	
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	
	public String getTipo(){
		return Tipo;
	}
	
	public void setTipo(String Tipo){
		this.Tipo=Tipo;
	}
	
	public double getPrecio(){
		return Precio;
	}
	
	public void setPrecio(double Precio){
		this.Precio=Precio;
	}
	


}
