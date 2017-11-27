package aula11.junit;

import aula11.codigos.Comum;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo Abreu
 */
public class TesteComum {
    Comum c;
    
    @Before
    public void setUp() {
        c = new Comum();
    }

    @Test
    public void testeGetSalario() {
        c.setSalario(1000);
        Comum.setAbono(100);
        assertEquals(1100, c.getSalario(),0.0);
    }
    
    @Test
    public void testGetNome(){
        c.setNome("Maria");
        assertEquals("Maria",c.getNome());
        c.setNome("maria");
        assertEquals("maria",c.getNome());
    }
}
