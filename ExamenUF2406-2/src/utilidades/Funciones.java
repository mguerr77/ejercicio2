package utilidades;

/**
 * Clase de utilidades con las siguientes funciones:
 *     devuelveCentral
 *     esBisiesto
 * @author David Casas
 *
 */
public class Funciones {
	
	/**
	 * Método que devuelve el numero que se encuentra en la posicion central
	 * en el orden numérico natural
	 * @param num1 int el primer numero
	 * @param num2 int com el segundo numero
	 * @param num3 int con el tercer numero
	 * @return int con el número que ocupa la posición central
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	

	/**
	 * Método de la clase que devuelve verdadero o false si el año pasado 
	 * como parámetro es bisiesto. Un año es bisiesto si es deivisible por 4
	 * pero si lo es por 1oo también debe serlo por 400
	 * @param anyo int con el año a comprobar, el año debe estar entre 1700 y 2500 
	 * @return boolean true si es bisiesto o flase en caso contrario
	 * @throws ArithmeticException que se lanza cuando el año no se encuetra entre 
	 * 1700 y 2500
	 */
	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
}
