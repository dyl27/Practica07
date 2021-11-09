/** 
 * RectanguloPractica04 representa un rentangulo. 
 * @author Dylan Juarez
 * @version 1.0
 */
public class RectanguloPractica04{
    private double altura;
    private double base;

    /** 
    *
    *Metodo constructor de un rectangulo con valores definidos crea un tringulo con una altura de 12 y un base de 20.
    *
    */
    public RectanguloPractica04(){
	this.altura = 12;
	this.base = 20;
    
    }
    /** 
    * Metodo constructor de un rectangulo apartir de una nueva base y altura.
    *@param altura - altura del rectangulo.
    *@param base - base del rectangulo.
    */
    public RectanguloPractica04(double altura, double base){
	this.altura = altura;
	this.base = base;
    }

    	
	//metodos modificadores(set) y de acceso(get)
    /** 
    * Metodo para obtener la altura del triangulo.
    *@return double - altura del rectangulo
    *
    */
    public double getAltura(){
        return this.altura;
    }
    /** 
    *Metodo que modifica el valor de la altura.
    *@param altura - altura del triangulo.
    */
    public void setAltura(double altura){
        this.altura = altura;
    }
    /** 
    *Metodo para obtener la base del rectangulo.
    *@return double - base del rectangulo.
    */
    public double getBase(){
	return this.base;
    }
    /** 
    *Metodo para modificar el valor de la base del triangulo.
    *@param base - base del trinangulo.
    */
    public void setBase(double base){
        this.base = base;
    }

    //metodo area
    /** 
    *Metodo que calcula el area de un trinangulo.
    *@return double - area del triangulo.
    *
    */
    public double Area(){
	return altura*base;
    }   

    //metodo perimetro
    /** 
    *Metodo que calcula el perimetro de un triangulo.
    *@return double - perimetro del triangulo.
    */  
    public double Perimetro(){
	double ladoB = base;
	double ladoA = altura;
	return 2*(ladoA + ladoB);	    
	
       
    }
    /** 
    *Metodo para obtener el valor en cadena de la base y la altura  del rectangulo.
    *@return String - base y altura del triangulo.
    */
    public String toString(){
	return "La base del Rectangulo es: " + base + " " + "La altura del Rectangulo es: " + altura; 
    }

    
}
