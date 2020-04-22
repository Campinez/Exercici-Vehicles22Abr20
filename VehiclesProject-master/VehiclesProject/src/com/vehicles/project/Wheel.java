package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

 //Creo dos getters para comprobar que estoy instanciando bien los pneumaticos(Esto no lo pedias)
	public String dame_Marca() {
		return "La marca del neumático es "+brand;
	}
	public String dame_Ancho() {
		String dato= String.valueOf(diameter);
		return "El diametro del neumático es "+ dato;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		return true;
	}
	
	
}
