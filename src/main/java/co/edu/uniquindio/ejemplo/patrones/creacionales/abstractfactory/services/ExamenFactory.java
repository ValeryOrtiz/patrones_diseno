package co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services;

public interface ExamenFactory {
    Examen crearParcial(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima);
    Examen crearQuiz(int duracion, int numeroPreguntas, String fechaExamen, double calificacionMaxima);
}
