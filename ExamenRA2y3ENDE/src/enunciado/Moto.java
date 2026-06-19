/**
 * @author: Pablo Vera
 * @date: 19/06/2026
 * @version:1.0.0
 * Clase Moto creada a partir  de la clase Coche
 */
package enunciado;


public class Moto extends Coche{

	/**
	 * 
	 * @param modelo: Modelo de la moto
	 * @param precioBase: Precio base de la moto
	 * @param electrico: Si es electrico o no
	 * @param tasaEmisiones: tasa de emisiones de la moto
	 * @param fianza: fianza de la moto
	 * @param numDias: Numero de dias que tiene la moto
	 */
	public Moto(String modelo, double precioBase, Boolean electrico, float tasaEmisiones, double fianza, int numDias) {
		super(modelo, precioBase, electrico, tasaEmisiones, fianza, numDias);
	}
	/**
	 * Constructor creado para la clase moto
	 */
	
	/**
	 * Metodo creado para calcular el precio neto de la moto, si no es electrico calcula normal el precio neto, si es electrico se calculara igual pero sumandole ele 7%
	 */
	@Override
	public double calcularPrecioNeto() {

		if(electrico == false) {
		return calcularPrecioBruto(getFianza(),getNumDias()) - calcularPrecioBruto(getFianza(),getNumDias());
		
		}else{
			return calcularPrecioBruto(getFianza(),getNumDias()) - calcularPrecioBruto(getFianza(),getNumDias())*0.07;
		}
	}

	
/**
 * 
 * @param extraKilometraje: variable creada para sumar valor a la moto
 * metodo creado para calcular el precio bruto sumando el precio base + el valor del kilometraje
 * si es menor que 0 el valor, lanzara una excepcion
 * @return
 */
	public double calcularPrecioBruto(double extraKilometraje) {
		
		double precioBruto = precioBase + extraKilometraje;
		
		
		if(extraKilometraje < 0) {
			throw new IllegalArgumentException("El valor extra del kilometraje no puede ser negativo");
		}
		
		return precioBruto;
	}


	/**
	 * Metodo creado para calcular el precio neto de la moto, si no es electrico calcula normal el precio neto, si es electrico se calculara igual pero sumandole ele 7%
	 */
	public double calcularPrecioNeto(double extraKilometraje) {

		if(electrico == false) {
		return calcularPrecioBruto(extraKilometraje) - calcularPrecioBruto(extraKilometraje);
		
		}else{
			return calcularPrecioBruto(extraKilometraje) - calcularPrecioBruto(extraKilometraje)*0.07;
		}
	}

}
		return calcularPrecioBruto(extraKilometraje) - calcularPrecioBruto(extraKilometraje);
		
		}else{
			return calcularPrecioBruto(extraKilometraje) - calcularPrecioBruto(extraKilometraje)*0.07;
		}
	}

}
