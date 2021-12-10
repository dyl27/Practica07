public class Main{
	public static void main(String[] args){
	  Empleado empleado = new Empleado("Ernesto");
	  Directivo directivo = new Directivo("Dylan");
	  Operador operador = new Operador("Arturo");
      Oficial oficial = new Oficial("Armando");
      Tecnico tecnico = new Tecnico("Luis");

      System.out.println("Metodo toString sobreescrito por las diferentes clases:");
      System.out.println(empleado.toString());
      System.out.println(directivo.toString());
      System.out.println(operador.toString()); 
      System.out.println(tecnico.toString());
      System.out.println("\t" + "tecnico dice: " + tecnico.trabajo());
      System.out.println(oficial.toString());
      System.out.println("\t" + "oficial dice: " + oficial.trabajo());

	}
}