package br.com.dev.projectjsf.view;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {
    private List<String> personagens = asList("Joji", "Yung", "Rihanna");
    private List<String> personagemSelecionado = new ArrayList<>();
    @PostConstruct
    public void init(){
        System.out.println("Entrou no PostConstruct do ViewScoped");
        personagens = asList("Violeta", "Azul", "Verde");
    }
    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }


    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;

    }
}
