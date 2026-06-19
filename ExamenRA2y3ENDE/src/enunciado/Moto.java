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

	

	public double calcularPrecioBruto(double extraKilometraje) {
		
		double precioBruto = precioBase + extraKilometraje;
		
		
		if(extraKilometraje < 0) {
			throw new IllegalArgumentException("El valor extra del kilometraje no puede ser negativo");
		}
		
		return precioBruto;
	}

	public double calcularPrecioNeto(double extraKilometraje) {

		if(electrico == false) {
		return calcularPrecioBruto(extraKilometraje) - calcularPrecioBruto(extraKilometraje);
		
		}else{
			return calcularPrecioBruto(extraKilometraje) - calcularPrecioBruto(extraKilometraje)*0.07;
		}
	}

}
