package br.com.dev.projectjsf.model;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class EstudanteRegistrarBean  implements Serializable {
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

}
