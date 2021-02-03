import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalarioTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculaSalarioBruto() {
		float salario = Salario.calculaSalarioBruto("vendedor", 2000, 8);
		float salida = 1360;
		assertEquals(salida, salario,0.2);
	}
	@Test
	public void testCalculaSalarioBruto2() {
		float salario = Salario.calculaSalarioBruto("vendedor", 1500, 3);
		float salida = 1260;
		assertEquals(salida, salario,0.2);
	}
	
	@Test
	public void testCalculaSalarioBruto3() {
		float salario = Salario.calculaSalarioBruto("vendedor", 1499.99f, 0);
		float salida = 1100;
		assertEquals(salida, salario,0.2);
	}

	@Test
	public void testCalculaSalarioBruto4() {
		float salario = Salario.calculaSalarioBruto("encargado", 1250, 8);
		float salida = 1760;
		assertEquals(salida, salario,0.2);
	}
	@Test
	public void testCalculaSalarioBruto5() {
		float salario = Salario.calculaSalarioBruto("encargado", 1000, 0);
		float salida = 1600;
		assertEquals(salida, salario,0.2);
	}
	@Test
	public void testCalculaSalarioBruto6() {
		float salario = Salario.calculaSalarioBruto("encargado", 999.99f, 3);
		float salida = 1560;
		assertEquals(salida, salario,0.2);
	}
	@Test
	public void testCalculaSalarioBruto7() {
		float salario = Salario.calculaSalarioBruto("encargado", 500, 0);
		float salida = 1500;
		assertEquals(salida, salario,0.2);
	}
	@Test
	public void testCalculaSalarioBruto8() {
		float salario = Salario.calculaSalarioBruto("encargado", 0, 8);
		float salida = 1660;
		assertEquals(salida, salario,0.2);
	}
	
	

	@Test
	public void testCalculaSalarioNeto() {
		assertEquals(1640,Salario.calculaSalarioNeto(2000),0.2);
	}
	@Test
	public void testCalculaSalarioNeto2() {
		assertEquals(1230,Salario.calculaSalarioNeto(1500),0.2);
	}
	/*
	 * @Test
	public void testCalculaSalarioNeto3() {
		assertEquals(1259.9916,Salario.calculaSalarioNeto(1499.99),0.2);
	}
	*/
	@Test
	public void testCalculaSalarioNeto4() {
		assertEquals(1050,Salario.calculaSalarioNeto(1250),0.2);
	}
	@Test
	public void testCalculaSalarioNeto5() {
		assertEquals(840,Salario.calculaSalarioNeto(1000),0.2);
	}
	/*
	 * @Test
	public void testCalculaSalarioNeto6() {
		assertEquals(999.99,Salario.calculaSalarioNeto(999.99),0.2);
	}
	*/
	@Test
	public void testCalculaSalarioNeto7() {
		assertEquals(500,Salario.calculaSalarioNeto(500),0.2);
	}
	@Test
	public void testCalculaSalarioNeto8() {
		assertEquals(0,Salario.calculaSalarioNeto(0),0.2);
	}
}
