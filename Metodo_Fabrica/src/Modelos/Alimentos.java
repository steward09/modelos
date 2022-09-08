package Modelos;

public class Alimentos extends Contenedor {
	
	private float masa1;
	
	public Alimentos (float [] valores) {
		
		super(valores);
		
	}
	
	public float getPeso() {
		
		masa1=valores[0];
		gravedad = valores[1];
		return peso =(float)(masa1*gravedad);
	}
}
