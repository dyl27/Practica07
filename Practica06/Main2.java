public class Main2{
	public static void main(String[] args){
       //veamos el paso de parametros por valor
		System.out.println("----------------Paso de parametros por valor---------------------");
		String colorCabello = "negro";
		System.out.println("valor de colorCabello antes de aplicarle el metodo pintarCabello: " + colorCabello);
		System.out.println("valor de colorCabello al aplicarle el metodo pintarCabello: "+ pintarCabello(colorCabello)); // le estamos pasando como parametro un copia del valor de centrigrados.
		System.out.println("valor de colorCabello depues de aplicarle el metodo pintarCabello: " + colorCabello); // el valor de centigrados seguira siendo el mismo. 
        System.out.println("\n");
       //veamos el paso de paramtros por referencia
	   Persona persona1 = new Persona("Dylan", 20, "negros", "negro"); //referencia o puntero.	
       System.out.println("----------------Paso de parametros por referencia-----------------");
       System.out.println("----------------antes del metodo pintarCabello-----------------");
       System.out.println("objeto persona antes de aplicarle la funcion pintarCabello : " + "\n" +  persona1.toString()); // el valor del color de cabello es negro.
       System.out.println("----------------al aplicarle del metodo pintarCabello-----------------");
       persona1.pintarCabello(persona1, "rubio"); // le estamos pasando como parametro la referencia o puntero del objeto  al metodo. 
       System.out.println("objeto persona al aplicarle la funcion pintarCabello : " + "\n" + persona1.toString());// el valor del color de cabello es rubio.
       System.out.println("----------------despues del metodo pintarCabello-----------------");
       System.out.println("objeto persona despues de aplicarle la funcion pintarCabello : " + "\n" +  persona1.toString()); // el valor de cabello sigue siendo rubio.
	}
	public static String pintarCabello(String colorCabello){
	  colorCabello = "rubio";	
      return colorCabello;
	}

}