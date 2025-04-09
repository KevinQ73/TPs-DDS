package domain.validador;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean esMateriaAprobada(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

    public void addMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
}
