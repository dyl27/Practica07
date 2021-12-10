public class Operador extends Empleado{
	//Metodos constructores.
	/**
	 * Constructor de un operador apartir de su nombre.
	 * @param nombre - valor del nombre del operador.
	 */
	public Operador(String nombre){
      super(nombre);
      asignarNombre(nombre);
	}
	//Metodo toString.
	/**
	 * Metodo que devuelve el nombre del operador en forma de cadena.
	 * @return String - tipo de valor del nombre del operador.
	 */
	@Override
	public String toString(){
		return "Operador: " + obtenerNombre();
	}


}