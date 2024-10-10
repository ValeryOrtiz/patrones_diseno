package co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.model;

import co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.services.IPago;

public class PagoTarjetaDebito implements IPago {
    private double valor;

    @Override
    public void crearPago() {
        System.out.println(
                "Se ha realizado el pago con tarjeta de debito por un monto de "
                        + valor
        );
    }

    @Override
    public void setMonto(double valor) {
        this.valor = valor;
    }
}
