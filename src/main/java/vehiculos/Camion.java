package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int CamionesCreados=0;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		CamionesCreados++;
	}

	public int getEjes() {
		return this.ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getCamionesCreados() {
		return CamionesCreados;
	}
}
