public class Directivo extends Empleado{
  //Metodos Constructores.
  /**
   * constructor de un directivo apartir de su nombre.
   * @param nombre - valor del nombre del directivo.
   */
  public Directivo(String nombre){
  	super(nombre);
    asignarNombre(nombre);
  }

  //Metodo toString.
  @Override
  public String toString(){
  	return "Directivo: " + obtenerNombre();
  }


}