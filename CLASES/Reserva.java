package com.dam.edgar;

class Reserva {
    int idCliente;
    int numHabitacion;
    String fechaInicioReserva;
    String fechaFinReserva;
    String estadoReserva;

    public Reserva(int idCliente, int numHabitacion, String fechaInicioReserva, String fechaFinReserva, String estadoReserva) {
        this.idCliente = idCliente;
        this.numHabitacion = numHabitacion;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
        this.estadoReserva = estadoReserva;
    }

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public String getFechaInicioReserva() {
		return fechaInicioReserva;
	}

	public void setFechaInicioReserva(String fechaInicioReserva) {
		this.fechaInicioReserva = fechaInicioReserva;
	}

	public String getFechaFinReserva() {
		return fechaFinReserva;
	}

	public void setFechaFinReserva(String fechaFinReserva) {
		this.fechaFinReserva = fechaFinReserva;
	}

	public String getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
    
}