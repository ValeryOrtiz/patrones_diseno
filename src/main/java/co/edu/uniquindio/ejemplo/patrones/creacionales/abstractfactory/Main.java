package co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory;


import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.model.ExamenInglesFactory;
import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.model.ExamenProgramacionFactory;
import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.Examen;
import co.edu.uniquindio.ejemplo.patrones.creacionales.abstractfactory.services.ExamenFactory;

/*
El sistema gestiona la creación de exámenes para
 diferentes materias, como inglés y programación,
 permitiendo generar tanto parciales como quizzes
 con características personalizadas, como duración,
 número de preguntas, y fecha de aplicación, según
 los requisitos de cada examen.
* */

public class Main {
    public static void main(String[] args) {
        abstractFactory();
    }

    private static void abstractFactory() {
        System.out.println("Abstract Factory");
        ExamenFactory examenInglesFactory = new ExamenInglesFactory();
        ExamenFactory examenProgramacionFactory = new ExamenProgramacionFactory();
        Examen parcialIngles = examenInglesFactory
                .crearParcial(90, 50,
                        "15/10/2024", 100);
        Examen quizIngles = examenInglesFactory
                .crearQuiz(30, 10,
                        "20/10/2024", 25);
        Examen parcialProgramacion = examenProgramacionFactory
                .crearParcial(120, 60,
                        "17/10/2024", 100);
        Examen quizProgramacion = examenProgramacionFactory
                .crearQuiz(20, 5,
                        "22/10/2024", 20);
        parcialIngles.mostrarTipo();
        parcialIngles.mostrarDetalles();
        quizIngles.mostrarTipo();
        quizIngles.mostrarDetalles();
        parcialProgramacion.mostrarTipo();
        parcialProgramacion.mostrarDetalles();
        quizProgramacion.mostrarTipo();
        quizProgramacion.mostrarDetalles();
    }
}

