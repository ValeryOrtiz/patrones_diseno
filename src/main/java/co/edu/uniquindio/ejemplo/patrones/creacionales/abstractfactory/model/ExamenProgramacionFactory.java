package co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.model;

import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.Examen;
import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.ExamenFactory;

public class ExamenProgramacionFactory implements ExamenFactory {
    @Override
    public Examen crearParcial(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima) {
        return new ParcialProgramacion(duracion, numeroPreguntas, fechaExamen, calificacionMaxima);
    }

    @Override
    public Examen crearQuiz(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima) {
        return new QuizProgramacion(duracion, numeroPreguntas, fechaExamen, calificacionMaxima);
    }
}

