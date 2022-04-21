package com.company.Ejercicio2;

import java.time.LocalDate;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Factura {

    private UUID uuid;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;

    public Factura(double montoTotal, Cliente cliente) {
        this.uuid = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "uuid=" + uuid +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }
}
