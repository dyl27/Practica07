public class Empleado{
	//atributos
	private String nombre;
	//Metodos Constructores
	/**
	 * Constructor de un empleado sin valor inicial.
	 */
	public Empleado(){
     asignarNombre(" ");
 	}
 	/**
 	 * Constructor de un empleado apartir de su nombre.
 	 * @param nombre - valor del nombre del empleado.
 	 */
 	public Empleado(String nombre){
     asignarNombre(nombre);
 	}
 	//Metodos de modificacion.
 	/**
 	 * Metodo que modifica el nombre.
 	 * @param nombreEmpleado -  valor del nombre del empleado.
 	 */
 	public void asignarNombre(String nombreEmpleado){
 		this.nombre = nombreEmpleado;
 	}
 	//Metodos de acceso.
 	/**
 	 * Metodo que obtiene el valor del nombre del empleado.
 	 * @return String - tipo de dato del valor del nombre del empleado.
 	 */
 	public String obtenerNombre(){
 		return this.nombre;
 	}
    //Metodo toString.
    /**
     * Metodo para obtener el valor del nombre del empleado en forma de cadena.
     * @return String - tipo de dato del valor del nombre del empleado. 
     */
    public String toString(){
    	return "Empleado: " + this.nombre;
    }

    //Metodo equals.
    /**
     * Metodo para comprar si dos empleados son el mismo.
     * @param p - objeto a comparar.
     * @return boolean - valor de verdad. 
     */
    public boolean equals(Object p){
       Empleado empleado2 = (Empleado)p;
       return  this.nombre.equals(empleado2.obtenerNombre());
    }



}