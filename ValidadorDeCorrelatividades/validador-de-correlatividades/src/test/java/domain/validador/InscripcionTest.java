package domain.validador;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void InscripcionAprobada() {

        Materia dds = new Materia("Diseño De Sistemas");
        Materia ads = new Materia("Análisis de Sistemas");
        Materia ayed = new Materia("Algoritmos y Estructura de Datos");
        Materia pdep = new Materia("Paradigmas de Programación");
        Materia ingles = new Materia("Ingles Tecnico 1");
        Materia syo = new Materia("Sistemas y Organizaciones");

        dds.addCorrelativa(ads);
        dds.addCorrelativa(ayed);
        dds.addCorrelativa(pdep);
        dds.addCorrelativa(ingles);
        dds.addCorrelativa(syo);

        Alumno alumno = new Alumno();
        alumno.addMateriaAprobada(ads);
        alumno.addMateriaAprobada(ayed);
        alumno.addMateriaAprobada(pdep);
        alumno.addMateriaAprobada(ingles);
        alumno.addMateriaAprobada(syo);

        List<Materia> materias = List.of(dds);
        Inscripcion inscripcion = new Inscripcion(materias, alumno);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void InscripcionDesaprobadaPorUnaMateria() {

        Materia dds = new Materia("Diseño De Sistemas");
        Materia ads = new Materia("Análisis de Sistemas");
        Materia ayed = new Materia("Algoritmos y Estructura de Datos");
        Materia pdep = new Materia("Paradigmas de Programación");
        Materia ingles = new Materia("Ingles Tecnico 1");
        Materia syo = new Materia("Sistemas y Organizaciones");

        dds.addCorrelativa(ads);
        dds.addCorrelativa(ayed);
        dds.addCorrelativa(pdep);
        dds.addCorrelativa(ingles);
        dds.addCorrelativa(syo);

        Alumno alumno = new Alumno();
        alumno.addMateriaAprobada(ads);
        alumno.addMateriaAprobada(ayed);
        alumno.addMateriaAprobada(pdep);
        alumno.addMateriaAprobada(ingles);

        List<Materia> materias = List.of(dds);
        Inscripcion inscripcion = new Inscripcion(materias, alumno);

        assertFalse(inscripcion.aprobada());
    }

    @Test
    public void InscripcionDesaprobadaPorVariasMateria() {

        Materia dds = new Materia("Diseño De Sistemas");
        Materia ads = new Materia("Análisis de Sistemas");
        Materia ayed = new Materia("Algoritmos y Estructura de Datos");
        Materia pdep = new Materia("Paradigmas de Programación");
        Materia ingles = new Materia("Ingles Tecnico 1");
        Materia syo = new Materia("Sistemas y Organizaciones");

        dds.addCorrelativa(ads);
        dds.addCorrelativa(ayed);
        dds.addCorrelativa(pdep);
        dds.addCorrelativa(ingles);
        dds.addCorrelativa(syo);

        Alumno alumno = new Alumno();
        alumno.addMateriaAprobada(ads);
        alumno.addMateriaAprobada(ayed);
        alumno.addMateriaAprobada(pdep);

        List<Materia> materias = List.of(dds);
        Inscripcion inscripcion = new Inscripcion(materias, alumno);

        assertFalse(inscripcion.aprobada());
    }

}