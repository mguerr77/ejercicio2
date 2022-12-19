package utilidades;


public class Funciones {
	
	
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
