/** 
*
*CicloDoWhilePractica02  nos calculara los numeros primos del 0 al 1000.
*@author Dylan Juarez
*/
public class CicloDoWhilePractica02{
    /** 
    *Metodo Main
    *@param args
    */
   public static void main(String[] args){
      // las variables i y j tienen un valor inicial de 2. 
      int i = 2;
      int j = 2;
      // definimos una varible booleana esPrimo.
      boolean esPrimo;
      // se ejecuta el primer bloque de codigo do 
      do{
       // esPrimo toma el valor de true. 	  
       esPrimo = true;
       // le asignamos el valor de j a 2.
       j = 2;
       // se ejecuta el ciclo while si se cumple que j sea mayor o igual a i/2.
       while(j <= i/2){
	 // si el residuo de i y j es igual a cero  entonces se ejecuta el bloque de codigo de if.   
         if(i % j == 0){
	   // esPrimo toma el valor de false ya que cumplio la condicion.  
           esPrimo = false;
	   // el ciclo se rompe.
           break;
         }
	 j++; // j incrementa.
       }
       // si esPrimo es verdad entonces se imprimira en pantalla el numero Primo.
       if (esPrimo) {
       	System.out.println("Es numero Primo : " + i);
       }
       i++; // i incrementa.
      }while(i <= 1000);// todo este bloque bloque de codigo se repetira si i es mayor o igual a 1000.





	}
}
