import java.util.Scanner;
/** 
*MainPractica04 nos calcula la cantidad de dinero en una cuenta una persona.
*@author Dylan Juarez
*@version 1.0
*/
public class MainPractica04{
      /** 
      *Metodo Main
      *@param args
      */
    public  static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("ingrese un nombre de usuario: ");
	String nombre = in.nextLine();
	
	System.out.println("ingrese dinero disponible : ");
	double dinero  = in.nextDouble();
	Cuenta usuario1 = new Cuenta(nombre , dinero);
	
        Scanner in2 = new Scanner(System.in);
        System.out.println("ingrese un otro nombre de usuario: ");
  	String nombre02 = in2.nextLine();
	
        System.out.println("ingrese  dinero disponible: ");
	double  dinero2 = in2.nextDouble();
	Cuenta usuario2 =  new Cuenta(nombre02 ,dinero2);

	
	System.out.println(usuario1.toString());
	System.out.println(usuario2.toString());

	double sumaDinero = usuario2.sumaDeDinero(usuario1);

	System.out.println("la suma de dinero disponible de " + usuario1.getTitular() + "  y la suma de dinero disponible de " + usuario2.getTitular() +"  es: " + sumaDinero);
    }
}
