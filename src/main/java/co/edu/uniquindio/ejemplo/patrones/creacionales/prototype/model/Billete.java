package co.edu.uniquindio.ejemplo.patrones.creacionales.prototype.model;

import co.edu.uniquindio.ejemplo.patrones.creacionales.prototype.services.IBillete;

public class Billete implements IBillete {
    private String tipoMoneda;
    private String paisEmision;
    private int valor;
    private int anoEmision;


    public Billete() {}

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getPaisEmision() {
        return paisEmision;
    }

    public void setPaisEmision(String paisEmision) {
        this.paisEmision = paisEmision;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAnoEmision() {
        return anoEmision;
    }

    public void setAnoEmision(int anoEmision) {
        this.anoEmision = anoEmision;
    }

    @Override
    public IBillete clonar() {
        Billete billete = null;
        try {
            billete = (Billete) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return billete;
    }

    @Override
    public String toString() {
        return "Billete:" +
                "tipo de Moneda: " + tipoMoneda + '\'' +
                ", pais Emision: " + paisEmision + '\'' +
                ", valor: " + valor +
                ", año Emision: " + anoEmision ;
    }
}

