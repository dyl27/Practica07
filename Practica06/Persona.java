/** 
 * Persona representa a un persona con sus caracteristicas.
 * @author Dylan Juarez
 * @version 1.0
 */
public class Persona{
	//atributos
	private String colorOjos;
	private String colorCabello;
	private int edad;
	private String nombre;

   //Constructor
   /**
    * Constructor de un persona mediante su nombre, edad, color de ojos y color de cabello.
    * @param nombre - nombre de la persona en tipo cadena.
    * @param edad - edad de la persona en tipo entera.
    * @param colorOjos - color de ojos de la persona en tipo cadena.
    * @param colorCabello - color de cabello de la persona en tipo cadena.
    */
   public Persona(String  nombre, int edad, String colorOjos, String colorCabello){
     this.nombre = nombre;
     this.edad = edad;
     this.colorOjos = colorOjos;
     this.colorCabello = colorCabello;
    }

    //Metodo  modificador
    /** 
     * Metodo que modifica el  valor de color de cabello.
     * @param p - persona que cambiara de color de cabello.
     * @param pintarColorCabello - color al que se cambiara el color de cabello.
     */
    public void pintarCabello(Persona p, String pintarColorCabello){
      p.asignarCabello(pintarColorCabello);
    }
    /** 
     * Metodo que asigna un nuevo valor de color de cabello.
     * @param nuevoColorCabello - nuevo color de cabello en tipo cadena. 
     */ 
    public void asignarCabello(String nuevoColorCabello){
       this.colorCabello = nuevoColorCabello;
    }
    //Metodo toString.
    /** 
     * Metodo que devuelve en forma de cadena los atributos del objeto persona.
     * @return String - valores de los atributos del objeto persona.
     */
    public String toString(){

      return "Nombre: " + this.nombre + "\n" + "Edad: " +  String.valueOf(this.edad) + "\n" + "Color de ojos: " + this.colorOjos + "\n" + "Color de cabello: " + this.colorCabello ;
    }




}