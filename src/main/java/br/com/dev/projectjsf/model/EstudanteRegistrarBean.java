package br.com.dev.projectjsf.model;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean  implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {" Cris do Dev", "eh", "foda"};
    private List<String> nomesList = asList("Adilson", "Gabriel", "Grivas","Joji","Leo", "Eric");
    private Set<String> nomesSet = new HashSet<>(asList("Goku", "Gabriel", "Naruto","Joji","Leo", "Eric"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("Grivas", "O lorde");
        nomesMap.put("Gabriel", "O mais nobre");

 //       for(Map.Entry<String, String> entry : nomesMap.entrySet()){
 //           System.out.println(entry.getKey());
 //           System.out.println(entry.getValue());
 //       }

    }

    public void executar() {
        System.out.println("Fazendo uma busca no BD com o PARAMETRO");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String param) {
        System.out.println("Fazendo uma busca no BD com o PARAMETRO: "+param);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public String executarRetorno(String param) {
        return "O que é Engenharia Social?" + param;
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";

    }
    public void exibirNotas(){
        this.mostrarNotas = true;

    }
    public  void  esconderNotas(){
        this.mostrarNotas = false;

    }
    public void exibirLink(){
        this.mostrarLink = true;

    }
    public void esconderLink() {
        this.mostrarLink = false;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

}
