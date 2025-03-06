package com.dam.edgar;

class Habitacion {
    int numHabitacion;
    String tipo;
    double precioPorNoche;

    public Habitacion(int numHabitacion, String tipo, double precioPorNoche) {
        this.numHabitacion = numHabitacion;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
    
}