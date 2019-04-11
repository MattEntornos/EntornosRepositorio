package entornos;

import entornos.Alumno;

/**
 * @author Anthony Cedeño
 * @version 1.0.
 */

public class Alumno {
	
	
	String nombre="matt";
	String apellidos="Acuña";
	private int  numalumnos=0;
	private static int notamedia=0;
	
	/**
	 * Constructor que cuenta alumnos creados.
	 */
	
	 public Alumno() {
	        numalumnos++;
	    }
	
	 /**
	* @param nom recogerá el nombre del alumno
	 * @param apell  los apellidos del alumno
	 * Cuando se cre un objeto incrementara el numero de alumno
	 */
	 
	 public Alumno(String nom, String apell){
			nombre=nom;
			apellidos=apell;
			numalumnos ++;
		}

	 public Alumno(Alumno alumno){
			this.nombre=alumno.getNombre();
			this.apellidos=alumno.getApellidos();
			numalumnos ++;
			
	 }
	
	 /**
	 * @return devuelve el nombre del alumno.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nom recoge el nombre del  alumno.
	 */
	public void setNombre(String nom) {
		this.nombre = nom;
	}

	/**

	 * @return devuelve los apellidos del alumno
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellido recoge los apellidos del alumno
	 */
	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}

	/**
	 * @return devuelve el numero de alumnos en total.
	 */
	public int getnumalumnos(){
		return numalumnos;
	}
	
	public void incrementar(){
		notamedia++;
	}
	
	public int resultado(){
		
		this.incrementar();
		incrementar();
		return notamedia;
		}
}
