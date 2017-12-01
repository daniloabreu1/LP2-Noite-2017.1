/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.list;

import java.util.ArrayList;

/**
 *
 * @author Danilo Abreu
 */
public class TestListas {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("jose");
        al.add("danilo");
        al.add(2, "maria");
        System.out.println(al);
        al.add(2, "pedro");
        al.add("pedro");
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.contains("pedro"));
        al.remove("pedro");
        for(int i=0; i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
