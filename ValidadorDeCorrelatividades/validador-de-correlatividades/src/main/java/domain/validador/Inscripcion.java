package domain.validador;

import java.util.List;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materiasAInscribir;

    public Inscripcion(List<Materia> materiasAInscribir, Alumno alumno) {
        this.materiasAInscribir = materiasAInscribir;
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public boolean aprobada() {
        for (Materia materia : materiasAInscribir) {
            for (Materia materiaCorrelativa : materia.getCorrelativas()){
                if (!alumno.esMateriaAprobada(materiaCorrelativa)){
                    return false;
                }
            }
        }
        return true;
    }
}
