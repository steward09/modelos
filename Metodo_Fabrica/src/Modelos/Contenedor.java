package Modelos;

public abstract class Contenedor {
	
	protected float masa;
	protected float gravedad;
	protected float peso;
	protected final float [] valores;
	
	Contenedor(float[] valores){
		
		this.valores = valores ;
	}
	
	public abstract float getPeso();
}