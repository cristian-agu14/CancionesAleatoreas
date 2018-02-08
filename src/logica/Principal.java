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

	private static int cantidadDecanciones = 0;

	public Principal() {
		super();

	}

	// public static void main(String args[]) {
	// readTxt();
	// probarArray();
	// }

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

	public static void readTxt() {
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

			cantidadDecanciones = listaCanciones.size();

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo debe de buscar un elemento por un id aleatoreo si lo encuentra lo
	 * debe eliminar de la lista de canciones
	 * 
	 * @return objeto de una cancion
	 */
	public Cancion buscarCancionPorId() {
		int id = 0;
		readTxt();
		Cancion auxCan = new Cancion(0, "", "", false);
		id = (int) (Math.random() * (cantidadDecanciones + 1));
		for (int i = 0; i < listaCanciones.size(); i++) {
			auxCan = listaCanciones.get(i);
			if (auxCan.getId() == id) {
				listaCanciones.remove(i);
				return auxCan;
			}
		}
		return auxCan;
	}

	public static void probarArray() {
		System.out.println("tamañooooooo = " + listaCanciones.size());
		for (int i = 0; i < listaCanciones.size(); i++) {
			System.out.println(listaCanciones.get(i));
		}
	}

}
