package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int CamionetasCreadas=0;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		CamionetasCreadas++;
	}

	public boolean isVolco() {
		return this.volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCamionetasCreadas() {
		return CamionetasCreadas;
	}
}
