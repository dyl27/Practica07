public class Tecnico extends Operador{
     // Metodo constructor
     /**
      * Constructor de un tecnico mediante su nombre.
      * @param nombre - valor del nombre del tecnico.
      */
     public Tecnico(String nombre){
          super(nombre);
          asignarNombre(nombre);
     }
     //Metodo toString.
     /**
      * Metodo que devuelve el nombre del tecnico.
      * @return String - tipo de valor del nombre del tecnico.
      */
      @Override
      public String toString(){
      	return "Tecnico: " + obtenerNombre();
      }      
	/**
     * Metodo que devuelve la frase estoy trabajando.
     * @return String - tipo de valor del dato.
     */
	public String trabajo(){
		return "¡Estoy trabajando!";
	}
}