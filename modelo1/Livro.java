/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Livro {
    private String titulo;
    private String editora;
    private int ano;
    private Autor escritor;

    public Livro(String titulo, String esitora, int ano, Autor escritor) {
        this.titulo = titulo;
        this.editora = esitora;
        this.ano = ano;
        this.escritor = escritor;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEsitora() {
        return editora;
    }

    public void setEditora(String esitora) {
        this.editora = esitora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }
    
    
}
