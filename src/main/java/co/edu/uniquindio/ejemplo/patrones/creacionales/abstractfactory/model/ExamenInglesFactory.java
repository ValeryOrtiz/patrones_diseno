package co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.model;

import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.Examen;
import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.ExamenFactory;

public class ExamenInglesFactory implements ExamenFactory {
    @Override
    public Examen crearParcial(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima) {
        return new ParcialIngles(duracion, numeroPreguntas, fechaExamen, calificacionMaxima);
    }

    @Override
    public Examen crearQuiz(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima) {
        return new QuizIngles(duracion, numeroPreguntas, fechaExamen, calificacionMaxima);
    }
}

