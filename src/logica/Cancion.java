package logica;

public class Cancion {
	
	private int id;
	
	private String nombre;
	
	private String  cantante;
	
	private boolean estadoJ;
	
	public Cancion() {
		super();
	}
	
	public Cancion(int id, String nombre, String cantante, boolean estadoJ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantante = cantante;
		this.estadoJ = estadoJ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public boolean isEstadoJ() {
		return estadoJ;
	}

	public void setEstadoJ(boolean estadoJ) {
		this.estadoJ = estadoJ;
	}
	
	
	
	
	

}
