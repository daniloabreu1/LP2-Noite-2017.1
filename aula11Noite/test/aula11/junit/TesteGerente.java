/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.junit;


import aula11.codigos.Gerente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo Abreu
 */
public class TesteGerente {
    
    Gerente g;
    public TesteGerente() {
    }
    
    @Before
    public void setUp() {
        g = new Gerente();
    }
    
    @Test
    public void testeBonificacao(){
        g.setSalario(3000);
        g.setBonificacao(1000);
        assertEquals(4000, g.getSalario(),0.0);
    }
}
