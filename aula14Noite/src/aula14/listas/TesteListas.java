/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class TesteListas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("pedro");
        nomes.add("maria");
        nomes.add("adriana");
        nomes.add("Carla");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa(1290, "Jose"));
        lista.add(new Pessoa(1201,"Fabio"));
        lista.add(new Pessoa(1260, "Jorge"));
        for(Pessoa p:lista){
            System.out.println(p.mat+" "+p.nome);
        }
        Collections.sort(lista);
        System.out.println("");
        lista.forEach(s -> System.out.println(s.mat+" "+s.nome));
        System.out.println(Collections.max(lista).nome);
    }
}
