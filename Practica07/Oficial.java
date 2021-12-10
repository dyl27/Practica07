public class Oficial extends Operador{
	// Metodo constructor
	/**
	 * Constructor de un oficial mediante su nombre.
	 * @param nombre - valor del nombre del oficial.
	 */
	public Oficial(String nombre){
		super(nombre);
		asignarNombre(nombre);
	}
	//Metodo toString.
	/**
	 * Metodo que devuelve el nombre del oficial.
	 * @return String - tipo de valor del oficial.
	 */
	@Override
	public String toString(){
		return "Oficial: " + obtenerNombre();
	}

    /**
     * Metodo que devuelve la frase estoy trabajando.
     * @return String - tipo de valor del dato.
     */
	public String trabajo(){
		return "¡Estoy trabajando!";
	}



}