/**
 * @author: Pablo Vera Martinez
 * @date: 19/06/2026
 * @version: 1.0.0
 */
package enunciado;

public abstract class Vehiculo {

    private static final int PRECIO_BASE_MINIMO = 45;
    protected String modelo;
    protected double precioBase;
    protected boolean electrico;
    protected float tasaEmisiones;
    /**
     * 
     * @param modelo: Modelo del vehiculo
     * @param precioBase: Precio base del vehiculo
     * @param electrico: Indica si el electrico o no
     * @param tasaEmisiones: Tasa de emisiones del vehiculo
     */
    // Constructor completo
    
    public Vehiculo(String modelo, double precioBase, Boolean electrico, float tasaEmisiones) {
        if (precioBase < PRECIO_BASE_MINIMO) {
            throw new IllegalArgumentException("El precio base no puede ser inferior al mínimo permitido");
        }
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.electrico = electrico;
        this.tasaEmisiones = tasaEmisiones;
    }
    
    /**
     * Constructor  creado para la clase de Vehiculos con excepciones
     * @param modelo
     */
	
    // Constructor simplificado
    public Vehiculo(String modelo) {
        this.modelo = modelo;
        this.precioBase = PRECIO_BASE_MINIMO;
        this.electrico = false;
        this.tasaEmisiones = 0;
    }
    
    /**
     * Constructor creado para la clase Vehiculo sin excepcion por lo que esta simplificada
     * @return
     */
	
    // Getters
    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    
    public boolean isElectrico() {
        return electrico;
    }

    public float getTasaEmisiones() {
        return tasaEmisiones;
    }
    
    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setTasaEmisiones(float tasaEmisiones) {
        this.tasaEmisiones = tasaEmisiones;
    }
	
    /**
     * 
     * @param fianza: Precio que debe de dar el comprador si le pasa algo al vehiculo
     * @param numDias: Indica el numero de dias
     * Este metodo lo que hace es calcular el precio bruto sumando el precio base con la fianza entre el numero de dias
     * Si la fianza es negativa y los dias son mayores son mayores que 12 o menor que 1, lanzara una excepcion
     * @return
     */
    public double calcularPrecioBruto(double fianza, int numDias) {
    	
    	double precioBruto = precioBase+fianza/numDias;
    	
    	if(fianza < 0) {
    		throw new IllegalArgumentException("La fianza no puede ser negativa");
    	}
    	
    	if(numDias < 1 && numDias >12 ) {
    		throw new IllegalArgumentException("El numero de dias no puede ser menor que 1 ni mayor que 12");

    	}
    	return precioBruto;
    }
    
    /**
     * Metodo abstracto llamado calcularPrecioNeto
     * @return
     */
    public abstract double calcularPrecioNeto();
}
