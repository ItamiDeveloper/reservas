package com.example.reservas.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_cliente", nullable = false)
    private String nombreCliente;

    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @Column(name = "fecha_reserva", nullable = false)
    private LocalDate fechaReserva;

    @Column(name = "nro_personas", nullable = false)
    private Integer nroPersonas;

    @Column(name = "sede", nullable = false)
    private String sede;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getNroPersonas() {
        return nroPersonas;
    }

    public void setNroPersonas(Integer nroPersonas) {
        this.nroPersonas = nroPersonas;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
