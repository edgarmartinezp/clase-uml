package com.dam.edgar;

import java.util.ArrayList;

class Hotel {
    ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public Reserva realizarReserva(int idCliente, int numHabitacion, String fechaInicio, String fechaFin) {
        Reserva reserva = new Reserva(idCliente, numHabitacion, fechaInicio, fechaFin, "Confirmada");
        reservas.add(reserva);
        return reserva;
    }

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Hotel [habitaciones=" + habitaciones + ", clientes=" + clientes + ", reservas=" + reservas + "]";
	}
	
}