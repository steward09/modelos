package Modelos;

public abstract class MFabrica {

	Contenedor con;
	float[] valores;
	
	MFabrica(float[] valores){
		this.valores = valores;
	}
	public abstract Contenedor calcular();
}
