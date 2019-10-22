/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor at01 = new Autor();
        Livro lv01 = new Livro();

        at01.setNome("Thiago");
        at01.setAnoNasc(2000);
        at01.setEmail("TT@gmail.com");

        lv01.setTitulo("POO");
        lv01.setAno(2018);
        lv01.setEditora("ABC");
       
       at01.setObra(lv01);
       lv01.setEscritor(at01);
       
        System.out.println("O Autor "+at01.getNome()+" escreve o Livro: "+at01.getObra().getTitulo());
        System.out.println("o livro "+lv01.getTitulo()+" é escrito pelo autor: "+lv01.getEscritor().getNome());
       
    }
    
}
