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
	
	public static ArrayList<Fabricante> listaFabricas=new ArrayList<Fabricante>();
	public static ArrayList<Integer> listaCantidad1=new ArrayList<Integer>();
	public static ArrayList<Pais> listaPaises=new ArrayList<Pais>();
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
		
		
		boolean existe=listaFabricas.contains(this.fabricante);
		if (existe) {
			int n=listaFabricas.indexOf(this.fabricante);
			listaCantidad1.set(n, listaCantidad1.get(n)+1);
		}else {
			listaFabricas.add(this.fabricante);
			listaCantidad1.add(1);
		}
		
		boolean nacionalidad=listaPaises.contains(this.fabricante.getPais());
		if (nacionalidad) {
			int m=listaPaises.indexOf(this.fabricante.getPais());
			listaCantidad2.set(m, listaCantidad2.get(m)+1);
		} else {
			listaPaises.add(this.fabricante.getPais());
			listaCantidad2.add(1);
		}
	}
	
	public static Fabricante fabricaMayorVentas() {
		int mayor=listaCantidad1.get(0);
		Fabricante fabri=listaFabricas.get(0);
		for (int j=1;j<listaCantidad1.size();j++) {
			if (listaCantidad1.get(j)>mayor) {
				mayor=listaCantidad1.get(j);
				fabri=listaFabricas.get(j);
			}
		}
		return fabri;
	}
	
	public static Pais paisMasVendedor() {
		int mayor=listaCantidad2.get(0);
		Pais pais=listaPaises.get(0);
		for (int k=1;k<listaCantidad2.size();k++) {
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

	public static void setCantidadVehiculos(int numero){
		CantidadVehiculos=numero;
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
