package logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	private static Cancion cancion;

	private static ArrayList<Cancion> listaCanciones = new ArrayList<>();

	private static int id;

	private static String nombre;

	private static String cantante;

	private static boolean estadoJ;

	private static boolean bandera = false;

	static int aux = 0;

	public Principal() {
		super();

	}

	 public static void main(String args[]) {
	 // readTxt();
	 probarArray();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	 buscarCancionPorId();
	
	 }

	public static BufferedReader getBuffered(String link) {

		FileReader lector = null;
		BufferedReader br = null;
		try {
			File Arch = new File(link);
			if (!Arch.exists()) {
				System.out.println("No existe el archivo");
			} else {
				lector = new FileReader(link);
				br = new BufferedReader(lector);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return br;
	}

	public static int readTxt() {
		try {

			String ruta = "C:/lista.txt";
			BufferedReader br = getBuffered(ruta);

			String linea = br.readLine();

			int contador = 0;
			while (linea != null) {
				String[] values = linea.split(",");

				// recorremos el arrar de string
				// for (int i = 0; i < values.length; i++) {
				// System.out.println(linea);
				id = Integer.parseInt(values[0]);
				nombre = values[1];
				cantante = values[2];
				estadoJ = Boolean.parseBoolean(values[3]);
				cancion = new Cancion(id, nombre, cantante, estadoJ);
				listaCanciones.add(cancion);
				// }

				contador++;
				linea = br.readLine();

			}

			// cantidadDecanciones = listaCanciones.size() + 1;
			// System.out.println(cantidadDecanciones+"tamaño +1111111");

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
		return listaCanciones.size();
	}

	/**
	 * Este metodo debe de buscar un elemento por un id aleatoreo si lo encuentra lo
	 * debe eliminar de la lista de canciones
	 * 
	 * @return objeto de una cancion
	 */
	public static Cancion buscarCancionPorId() {
		int id = 0;
		Cancion auxCan = new Cancion(0, "", "", false);
		if (bandera == false) {
			aux = readTxt();
			bandera = true;
		}
		//final int cantidadDecanciones = aux;// listaCanciones.size();
		int cantidadDecanciones = aux;
		id = (int) (Math.random() * cantidadDecanciones);
		
		auxCan = listaCanciones.get(id);
		listaCanciones.remove(id);
		

//		for (int i = 0; i < listaCanciones.size(); i++) {
//			
//			auxCan = listaCanciones.get(i);
//			if (auxCan.getId() == id) {
//				listaCanciones.remove(i);
//				System.out.println(auxCan.getNombre());
//				return auxCan;
//			}
//		
//		 }
		aux --;
		return auxCan;
	}

	// public boolean comprovarYaSalio(int numeroRamdom, int tamaño) {
	//
	// int [] arreglo= new int [cantidadDecanciones];
	// for (int i = 0; i < arreglo.length; i++) {
	// arreglo[i]=id;
	// }
	// }

	public static void probarArray() {
		System.out.println("tamañooooooo = " + listaCanciones.size());
		for (int i = 0; i < listaCanciones.size(); i++) {
			System.out.println(listaCanciones.get(i));
		}
	}

	public static Cancion getCancion() {
		return cancion;
	}

	public static void setCancion(Cancion cancion) {
		Principal.cancion = cancion;
	}

	public static ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public static void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		Principal.listaCanciones = listaCanciones;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Principal.id = id;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Principal.nombre = nombre;
	}

	public static String getCantante() {
		return cantante;
	}

	public static void setCantante(String cantante) {
		Principal.cantante = cantante;
	}

	public static boolean isEstadoJ() {
		return estadoJ;
	}

	public static void setEstadoJ(boolean estadoJ) {
		Principal.estadoJ = estadoJ;
	}

}
