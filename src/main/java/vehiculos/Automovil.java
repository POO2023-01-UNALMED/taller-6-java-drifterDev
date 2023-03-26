package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int AutomovilesCreados=0;
	
	public Automovil(String placa, String nombre,int precio, int peso, Fabricante fabricante) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		AutomovilesCreados++;
	}

	public int getPuestos() {
		return this.puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int getAutomovilesCreados() {
		return AutomovilesCreados;
	}
}