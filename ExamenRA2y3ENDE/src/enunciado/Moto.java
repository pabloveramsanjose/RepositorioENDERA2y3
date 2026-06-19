package enunciado;

public class Moto extends Coche{

	public Moto(String modelo, double precioBase, Boolean electrico, float tasaEmisiones, double fianza, int numDias) {
		super(modelo, precioBase, electrico, tasaEmisiones, fianza, numDias);
	}
	
	@Override
	public double calcularPrecioNeto() {

		if(electrico == false) {
		return calcularPrecioBruto(getFianza(),getNumDias()) - calcularPrecioBruto(getFianza(),getNumDias());
		
		}else{
			return calcularPrecioBruto(getFianza(),getNumDias()) - calcularPrecioBruto(getFianza(),getNumDias())*0.07;
		}
	}

}
