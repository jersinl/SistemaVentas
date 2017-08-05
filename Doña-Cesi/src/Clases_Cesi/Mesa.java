package Clases_Cesi;

public class Mesa {

	private int Numero_Mesa;
	private int Tipo;
	private int Estado;
	
	
	
	
	public Mesa(int Numero_Mesa, int Tipo, int Estado) {
		
			this.Numero_Mesa=Numero_Mesa;
			this.Tipo=Tipo;
			this.Estado=Estado;
	}


public int getNumero_Mesa(){
	
	return Numero_Mesa;
	
}

public void setNumero_Mesa(int Numero_Mesa){
	
	
	this.Numero_Mesa=Numero_Mesa;
}

public int getTipo(){
	
	return Tipo;
	
}

public void setTipo(int Tipo){
	
	this.Tipo=Tipo;
}


public int getEstado(){
	
	return Estado;
}

public void setEstado(int Estado){
	
	this.Estado=Estado;	
}




}
