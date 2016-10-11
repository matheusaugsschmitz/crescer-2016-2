
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AtaqueIntercaladoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class AtaqueIntercaladoTest{
    @Test
    public void ordenar1VerdeE1Noturno() throws ContingenteDesproporcionalException {
        Elfo e1 = new ElfoVerde("f");
        Elfo e2 = new ElfoNoturno("f");
        AtaqueIntercalado ai = new AtaqueIntercalado();
        List<Elfo> elfos = new ArrayList<Elfo>();
        elfos.add(e1);
        elfos.add(e2);
        List<Elfo> retorno = ai.getOrdemDeAtaque(elfos);
        assertEquals(e1, retorno.get(0));
        assertEquals(e2, retorno.get(1));   
    }
    
    @Test
    public void ordenar2VerdeE2Noturno() throws ContingenteDesproporcionalException {
        Elfo e1 = new ElfoVerde("a");
        Elfo e2 = new ElfoNoturno("b");
        Elfo e3 = new ElfoVerde("c");
        Elfo e4 = new ElfoNoturno("d");
        AtaqueIntercalado ai = new AtaqueIntercalado();
        List<Elfo> elfos = new ArrayList<Elfo>();
        elfos.add(e1);
        elfos.add(e2);
        elfos.add(e3);
        elfos.add(e4);
        List<Elfo> retorno = ai.getOrdemDeAtaque(elfos);
        assertEquals(e3, retorno.get(0));
        assertEquals(e4, retorno.get(1));   
        assertEquals(e1, retorno.get(2));
        assertEquals(e2, retorno.get(3));   
    }
    
    @Test(expected=ContingenteDesproporcionalException.class)
    public void ordenar1VerdeE2Noturno() throws ContingenteDesproporcionalException {
        Elfo e1 = new ElfoVerde("f");
        Elfo e2 = new ElfoNoturno("f");
        Elfo e3 = new ElfoNoturno("f");
        AtaqueIntercalado ai = new AtaqueIntercalado();
        List<Elfo> elfos = new ArrayList<Elfo>();
        elfos.add(e1);
        elfos.add(e2);
        elfos.add(e3);
        List<Elfo> retorno = ai.getOrdemDeAtaque(elfos);
        assertEquals(e1, retorno.get(0));
        assertEquals(e2, retorno.get(1));   
    }
}
