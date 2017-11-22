/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.junit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Danilo Abreu
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({aula11.junit.TesteComum.class, aula11.junit.TesteGerente.class})
public class TestarTudo {

    @Before
    public void setUp() throws Exception {
    }
    
}
