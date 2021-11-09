/** 
* clase Primitivo nos calcula el tamaño en memoria de los datos primitivos
* @author Dylan Juarez
* @version 1.0
*/
public class Primitivo{
    /** 
    *clase Main
    *@author dylan
    *@version 1.0
    */
    public static void main(String[] args){
       System.out.println("byte: " + Byte.BYTES + " ocupa bytes");
       System.out.println("short: " + Short.BYTES + " ocupa bytes");
       System.out.println("int: " + Integer.BYTES + " ocupa  bytes");
       System.out.println("float: " + Float.BYTES + " ocupa  bytes");
       System.out.println("double: " + Double.BYTES + " ocupa bytes");
       System.out.println("char: " + Character.BYTES + " ocupa bytes");
       System.out.println("boolean: ocupa 1 byte");
   }
}
