package vehiculos;
import java.util.*;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos=0;
	
	public static ArrayList<String> listaFabricas=new ArrayList<String>();
	public static ArrayList<Integer> listaCantidad1=new ArrayList<Integer>();
	public static ArrayList<String> listaPaises=new ArrayList<String>();
	public static ArrayList<Integer> listaCantidad2=new ArrayList<Integer>();
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima, String nombre,int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		CantidadVehiculos = getCantidadVehiculos() + 1;
		
		
		boolean existe=listaFabricas.contains(this.fabricante.getNombre());
		if (existe) {
			int n=listaFabricas.indexOf(this.fabricante.getNombre());
			listaCantidad1.set(n, listaCantidad1.get(n)+1);
		}else {
			listaFabricas.add(this.fabricante.getNombre());
			listaCantidad1.add(1);
		}
		
		boolean nacionalidad=listaPaises.contains(this.fabricante.getPais().getNombre());
		if (nacionalidad) {
			int m=listaPaises.indexOf(this.fabricante.getPais().getNombre());
			listaCantidad2.set(m, listaCantidad2.get(m)+1);
		} else {
			listaPaises.add(this.fabricante.getPais().getNombre());
			listaCantidad2.add(1);
		}
	}
	
	public static String fabricaMayorVentas() {
		int mayor=0;
		String fabrica="";
		for (int j=0;j<listaCantidad1.size();j++) {
			if (listaCantidad1.get(j)>mayor) {
				mayor=listaCantidad1.get(j);
				fabrica=listaFabricas.get(j);
			}
		}
		return fabrica;
	}
	
	public static String paisMasVendedor() {
		int mayor=0;
		String pais="";
		for (int k=0;k<listaCantidad2.size();k++) {
			if (listaCantidad2.get(k)>mayor) {
				mayor=listaCantidad1.get(k);
				pais=listaPaises.get(k);
			}
		}
		return pais;
	}
	
	public void vehiculosPorTipo() {
		System.out.println("Automoviles: "+Automovil.getAutomovilesCreados());
		System.out.println("Camiones: "+Camion.getCamionesCreados());
		System.out.println("Camionetas: "+Camioneta.getCamionetasCreadas());
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return this.puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return this.traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
