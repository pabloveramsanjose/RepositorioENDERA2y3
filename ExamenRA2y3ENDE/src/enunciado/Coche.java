/**
 * @author: Pablo Vera
 * @date: 19/06/2026
 * @version:1.0.0
 * Clase Moto creada a partir  de la clase Coche
 */
package enunciado;

public class Coche extends Vehiculo{
	
	private double fianza;
	private int numDias;


	public Coche(String modelo, double precioBase, Boolean electrico, float tasaEmisiones, double fianza, int numDias) {
		super(modelo, precioBase, electrico, tasaEmisiones);
		this.fianza = fianza;
		this.numDias = numDias;
	}



	public double getFianza() {
		return fianza;
	}



	public void setFianza(double fianza) {
		this.fianza = fianza;
	}



	public int getNumDias() {
		return numDias;
	}



	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}


/**
 * Metodo creado para calcular el precio neto con la fianza y el numero de dias
 */
	@Override
	public double calcularPrecioNeto() {

		double salarioNeto = calcularPrecioBruto(fianza,numDias) - calcularPrecioBruto(fianza,numDias)*getTasaEmisiones();
		return 0;
	}

}
