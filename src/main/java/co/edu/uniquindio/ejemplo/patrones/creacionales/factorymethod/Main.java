package co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod;


import co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.model.PagoFactory;
import co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.services.IPago;
import co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.services.TipoPago;

public class Main {
    public static void main(String[] args) {
        factoryMethod();
    }

    private static void factoryMethod() {
        System.out.println("Factory Method");
        PagoFactory pagoFactory = new PagoFactory();
        try {
            IPago pago1 = pagoFactory.obtenerPago(TipoPago.EFECTIVO);
            pago1.setMonto(100000);
            IPago pago2 = pagoFactory.obtenerPago(TipoPago.TARJETA_CREDITO);
            pago2.setMonto(400000);
            IPago pago3 = pagoFactory.obtenerPago(TipoPago.TARJETA_DEBITO);
            pago3.setMonto(20000);
            IPago pago4 = pagoFactory.obtenerPago(TipoPago.TRANSFERENCIA);
            pago4.setMonto(18500);
            pago1.crearPago();
            pago2.crearPago();
            pago3.crearPago();
            pago4.crearPago();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
