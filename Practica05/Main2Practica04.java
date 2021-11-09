import java.util.Scanner;
/** 
 * Main2Practica04 nos calcula  el area de un rectangulo asi como su perimetro. 
 * @author Dylan Juarez.
 */
public class Main2Practica04{
     /** 
     *Metodo Main
     *@param args
     */
    public static void main(String[] args){
       System.out.println("---------------------Datos del rectangulo no  definido----------------------");
	//rectangulo no definido
	Scanner in = new Scanner(System.in);
	System.out.println("Introduzca la altura del rectangulo:");
	double altura = in.nextDouble();
	System.out.println("Introduzca la base del rectangulo:");
        double base = in.nextDouble();
	Rectangulo rectangulo2 = new Rectangulo(altura, base);
	String dimensiones2 = rectangulo2.toString();
	double area2 = rectangulo2.Area();
	double perimetro2 = rectangulo2.Perimetro();
       	System.out.println(dimensiones2);
	System.out.println("El area del rectangulo es: " + area2);
	System.out.println("El perimetro del rectangulo es:" + perimetro2);
        System.out.println("la altura  del rectangulo es:" + rectangulo2.getAltura() + " " + "lo mostramos con la funcion get");
	System.out.println("la base  del rectangulo2 es:" + rectangulo2.getBase() + " " + "lo mostramos con la funcion get"); 
		

	System.out.println("---------------------Datos del rectangulo definido----------------------");
	//rectangulo definido
	Rectangulo rectangulo1 = new Rectangulo();
	double area1 = rectangulo1.Area();
	double perimetro1 = rectangulo1.Perimetro();
	String dimensiones = rectangulo1.toString();
	System.out.println(dimensiones);
	System.out.println("El area del rectangulo es: " + area1);
	System.out.println("El perimetro del rectangulo es:" + perimetro1);
        System.out.println("la altura  del rectangulo es:" + rectangulo1.getAltura() + " " +  "lo mostramos con la funcion get");
	System.out.println("la base  del rectangulo es:" + rectangulo1.getBase() + " " + "lo mostramos con la funcion get");
    }
}
