import java.util.Scanner;
/** 
*
* CondicionalesPractica01 nos calculara si un numero es mayor, es menor o son iguales.
* numero1 > numero2, numero1 < numero2 y numero1 = numero 2.
* @author Dylan Juarez
* @version 1.0
*/ 
public class CondicionalesPractica01{
    /** 
    *Metodo Main
    *@param args
    */
   public static void main(String[] args){
   // instanciamos el objeto Scanner de la clase Scanner.     
   Scanner in = new Scanner(System.in);
   System.out.println("***********Condicionales***********");
   // pedimos el primer numero al usuario
   System.out.println("ingresa el numero1: ");
   int numero1 = in.nextInt();
   //pedimos el segundo numero al usuario.
   System.out.println("ingresa el numero2: "); 
   int numero2 = in.nextInt();
   // condicionales.
   if (numero1 > numero2) {
      	System.out.println("El numero con mayor valor es: " + numero1);
      }else if (numero2 > numero1) {
         
         System.out.println("El numero con mayor valor es: "  + numero2);

      }else{System.out.println("Los numeros son iguales");}

      

}
}
