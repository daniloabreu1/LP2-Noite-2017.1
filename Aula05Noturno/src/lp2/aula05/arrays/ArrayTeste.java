/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05.arrays;

import java.util.Arrays;



/**
 *
 * @author Danilo Abreu
 */
public class ArrayTeste {
    public static void main(String args[]){
        int vet1[] = new int[3];
        int vet2[] = {35,85,9};
        Arrays.sort(vet2);
        for(int i:vet2){
            System.out.println(i);
        }
        
        
    }
}
