package enunciado;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
class TestMoto extends Moto{


	private boolean electrico;
	private int numDias;
	private double fianza;
	
	private double precioEsperado;
	
	public TestMoto(String modelo, double precioBase, Boolean electrico, float tasaEmisiones, double fianza,
			int numDias) {
		super(modelo, precioBase, electrico, tasaEmisiones, fianza, numDias);
	}


	private static ArrayList<Vehiculo> vehiculos;
	
	private Moto moto;
	
	
	@BeforeClass
	public static void añadirVehiculos() {
		vehiculos = new ArrayList<>();
	}
	
	@AfterClass
	public static void limpiarLista() {
		vehiculos.clear();
	}
	
	
	@Test
	void testVehiculo() {
		moto = new Moto("Mercedes", 7599.99, false, 0.07f,300, 10);
	}

	@Ignore
	@Test
	public void testPrecio() {
		
	}
	
	
	@Parameterized.Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] {
			{"Mercedes", 8000.00,true,0.00f,400,7},
			{"Honda", 6500.00,false,0.10f,600,10},
			{"Kawasaki", 2000.00,false,0.20f,100,4},
			{"Mercedes", 4999.99,true,0.00f,800,12},
			{"BMW", 10000.00,true,0.00f,900,11}
			
		});
	}
	
	@Test
	public void TestError() {
	Moto	cuenta = new Moto("Test",2000.00, false,0.07f,-200,14);
	
	assertEquals(precioEsperado, moto.calcularPrecioBruto(fianza, numDias));
	
	}

}
