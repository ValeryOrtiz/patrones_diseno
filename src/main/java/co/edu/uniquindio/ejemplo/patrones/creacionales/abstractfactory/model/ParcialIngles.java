package co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.model;

import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.Examen;

public class ParcialIngles implements Examen {
    private int duracion;
    private int numeroPreguntas;
    private String fechaExamen;
    private double calificacionMaxima;
    private String materia;

    public ParcialIngles(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima) {
        this.duracion = duracion;
        this.numeroPreguntas = numeroPreguntas;
        this.fechaExamen = fechaExamen;
        this.calificacionMaxima = calificacionMaxima;
        this.materia = "Inglés";
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de examen: Parcial de Inglés");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("- " +
                "duracion: " + duracion + " minutos " +
                ", numero de preguntas: " + numeroPreguntas +
                ", fecha del examen: " + fechaExamen + '\'' +
                ", calificacion Maxima: " + calificacionMaxima +
                ", materia: " + materia );

    }
}

