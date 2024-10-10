package co.edu.uniquindio.ejemplo.patrones.creacionales.prototype;



import co.edu.uniquindio.ejemplo.patrones.creacionales.prototype.model.Billete;
import co.edu.uniquindio.ejemplo.patrones.creacionales.prototype.services.IBillete;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        prototype();
    }

    private static void prototype() {
        Billete billete = new Billete();
        billete.setValor(100);
        billete.setAnoEmision(2024);
        billete.setPaisEmision("Francia");
        billete.setTipoMoneda("EUR");
        System.out.println("Billete original:");
        System.out.println(billete);
        List<IBillete> billetes = clonarBillete(billete, 20);
        System.out.println("\nBilletes clonados:");
        for (IBillete billeteClon : billetes) {
            System.out.println(billeteClon);
        }
    }
    private static List<IBillete> clonarBillete(IBillete billete, int cantidadClones) {
        List<IBillete> billetesClonados = new ArrayList<>();
        for (int i = 0; i < cantidadClones; i++) {
            IBillete billeteClonado = billete.clonar();
            billetesClonados.add(billeteClonado);
        }
        return billetesClonados;
    }
}
