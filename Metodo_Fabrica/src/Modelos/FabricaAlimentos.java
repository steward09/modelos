package Modelos;

public class FabricaAlimentos extends MFabrica{

	public FabricaAlimentos (float [] valores) {
		
		super(valores);
	}
	public Contenedor calcular() {
		
		con = new Alimentos (valores);
		return con;
	}
}
