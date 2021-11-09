/** 
* NumerosPrimosCicloforPractica01 nos calculara todos los numeros primos del 0 al 1000.
* @author Dylan Juarez
* @version 1.0
*/
public class NumerosPrimosCicloforPractica01{
 /** 
 *Metodo Main
 *@param args
 */
public static void main(String[] args){
  // creamos una varible boolean con el valor inicial en false
  boolean primo = false;
  // primer ciclo for que iterara siempre y cuando la variable i sea  menor a 1000 y asu vez ejecutara el codigo que este dentro de el.
    for(int i = 0; i < 1000; i++){
     // la varible booleana tendra valor de true, solo  en caso de que no se cumpla la condicion del segundo ciclo for.	
     primo = true;
     // segundo ciclo for que iterara siempre y cuando la varible j sea menor a i/2 y ejecutara el codigo que esta dentro de el.. 
      for(int j = 2; j < i/2 ; j++){
	  //la condicion se cumplira siempre y cuando el residuo de i entre j sea igual a cero.
           if(i % j == 0){
	       // la varible tendra un valor de false ya que se cumplio la condicion.
              primo = false;
              break;
           }
      }
      // la condicion en caso de cumplirse nos impimira en pantalla el numero primo.
     if(primo){
       System.out.println("Es primo el numero: " + i );
     }
    } 


  }
}   
  
