/** 
* CuentaPractica04 representa la cuenta de dinero de una persona.
*@author Dylan Juarez
*@version 1.0 
*/
public class CuentaPractica04{
    //atributos
    private String titular;
    private double dineroDisponible;

   //constructor sin valores definidos
    public CuentaPractica04(String titular, double dineroDisponible){
        this.titular = titular;
	this.dineroDisponible = dineroDisponible;
    }
    //constructor con valores definidos
    public CuentaPractica04(String titular){
	this.titular = titular;
	this.dineroDisponible = 0;
    }

    //metodos modificadores y de acceso.
    /** 
     * Metodo para obtener el nombre del titular. 
     * @return String - nombre del titular.
     * 
     */
    public String getTitular(){
        return this.titular;         
    }
    /** 
     * Metodo para asignar un nuevo titular.
     * @param titular - nuevo titular
     * 
     */
    
    public void setTitular(String titular){
	this.titular = titular;
    }
    /** 
     *Metodo que asigna un nuevo valor de dinero disponible. 
     *@param dineroDisponible - dinero disponible.
     * 
     */
    
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }
    /**  
     * Metodo que para obtener el dinero disponible.
     * @return double - dinero disponible
     */

    public double getDineroDisponible(){
	return this.dineroDisponible;
    }
    /** 
     *Metodo para obtener en forma de cadena el dinero disponible y el nombre del titular. 
     *@return String -  dinero disponible y nombre del titular. 
     */
    //metodo toString
    public String toString(){
	return "El nombre de usuario es: " + titular  + " " +  " Dinero disponible: " + dineroDisponible; 
    }
    /** 
    *Metodo que suma el dinero de dos usuarios.
    *@param Cuenta - cuenta que sumar con otra. 
    *@return double - suma de las cuentas. 
    */

    public double sumaDeDinero(CuentaPractica04 usuario){
	double suma = this.dineroDisponible + usuario.getDineroDisponible();
	return suma;
    }

}

