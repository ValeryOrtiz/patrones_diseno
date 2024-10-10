package co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.model;

import co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.services.IPago;
import co.edu.uniquindio.ejemplo.patrones.creacionales.factorymethod.services.TipoPago;

public class PagoFactory {
    public IPago obtenerPago(TipoPago tipoPago) throws NoSuchFieldException{
        if(tipoPago == TipoPago.EFECTIVO ){
            return new PagoEfectivo();
        }else if(tipoPago == TipoPago.TRANSFERENCIA){
            return new PagoTransferencia();
        }else if(tipoPago== TipoPago.TARJETA_CREDITO){
            return new PagoTarjetaCredito();
        }else if(tipoPago== TipoPago.TARJETA_DEBITO){
            return new PagoTarjetaDebito();
        }else{
            throw new NoSuchFieldException("Tipo de pago no encontrado");
        }
    }
}
