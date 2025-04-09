package domain.validador;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void addCorrelativa(Materia correlativa) {
        this.correlativas.add(correlativa);
    }

    public String getNombre() {
        return nombre;
    }
}
