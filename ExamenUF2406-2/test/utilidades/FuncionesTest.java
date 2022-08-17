package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {
	
	static Funciones f;
	
	@BeforeAll
	static void inicializar() {
		f = new Funciones();
	}

	@Test
	void devuelveCentralTest() {
		//Funciones f= new Funciones();
		assertEquals(5, f.devuelveCentral(5, 2, 7), "debe devolver 5");
		assertEquals(5, f.devuelveCentral(5, 7, 2), "debe devolver 5");

		assertEquals(5, f.devuelveCentral(2, 5, 7), "debe devolver 5");
		assertEquals(5, f.devuelveCentral(7, 5, 2), "debe devolver 5");

		assertEquals(5, f.devuelveCentral(2, 7, 5), "debe devolver 5");
		assertEquals(5, f.devuelveCentral(7, 2, 5), "debe devolver 5");

	}
	
	@Test
	void esBisiestoTest() {
		//Funciones f= new Funciones();
		assertFalse(f.esBisiesto(2022), "2022 NO es bisiesto");
		assertTrue(f.esBisiesto(2020), "2020 es bisiesto");
		assertTrue(f.esBisiesto(2000), "2000 es bisiesto");
		assertFalse(f.esBisiesto(2100), "2100 NO es bisiesto");
		assertThrows(ArithmeticException.class, ()->f.esBisiesto(1600),
				"Debe estar 1700 y 2500");
		assertThrows(ArithmeticException.class, ()->f.esBisiesto(2800),
				"Debe estar 1700 y 2500");

	}

}
