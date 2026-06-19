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



	@Override
	public double calcularPrecioNeto() {

		double salarioNeto = calcularPrecioBruto(fianza,numDias) - calcularPrecioBruto(fianza,numDias)*getTasaEmisiones();
		return 0;
	}

}
