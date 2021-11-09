/**
*CicloWhilePractica02 nos calculara los numeros primos del 0 al 1000.
*@author Dylan Juarez
*/
public class CicloWhilePractica02{
         /** 
        *Metodo Main
        *@param args
        */
	public static void main(String[] args){
	 // iniciamos las variables i y j en 2.    
	 int i = 2;
	 int j = 2;
	 //definimos la variable booleana esPrimo.
	 boolean esPrimo;
      //primer ciclo while repetira el bloque de codigo siempre y cuando i sea menor o igual a 1000.         
      while(i <= 1000){
	 // esPrimo tomara el valor de verdad. 
      	esPrimo = true;
	// j tendra un valor de 2
      	j = 2;
	// segundo ciclo while repetira el bloque de codigo siempre y cuando j sea menor o igual a i/2.
        while(j <= i/2){
	 // si el residuo de i y j es igual a cero entonces esPrimo toma el valor de falso y se rompe el segundo ciclo while.   
         if(i % j == 0){
           esPrimo = false;
           break;
         }

	 j++; // j incrementa
        }
        // si esPrimo toma el valor de verdad entonces nos imprimira en pantalla el numero primo.
       if (esPrimo) {
       	System.out.println("Es numero primo : " + i);
       }

       i++; // i incrementa.
     
      }



	}

}
