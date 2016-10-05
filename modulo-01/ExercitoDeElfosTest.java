

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExercitoDeElfosTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExercitoDeElfosTest{
    @Test
    public void criarExercitoCom1ElfoVerdeE1ElfoNoturno(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        e.alistarElfo(new ElfoVerde("Josias"));
        e.alistarElfo(new ElfoNoturno("Jonas"));
        assertEquals(2, e.getElfosAlistados().size());
    }
    
    @Test
    public void criarExercitoCom3ElfosNormais(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        e.alistarElfo(new Elfo("Josias"));
        e.alistarElfo(new Elfo("Jonas"));
        e.alistarElfo(new Elfo("Jonas"));
        assertEquals(0, e.getElfosAlistados().size());
    }
    
    @Test
    public void criarExercitoSemElfos(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        assertEquals(0, e.getElfosAlistados().size());
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosDiferentes(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        e.alistarElfo(ev);
        e.alistarElfo(new ElfoNoturno("Jonas"));
        assertEquals(ev, e.buscarPorNome("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosIguais(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Josias");
        e.alistarElfo(ev);
        e.alistarElfo(en);
        assertEquals(ev, e.buscarPorNome("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeSemElfox(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        assertEquals(null, e.buscarPorNome("Josias"));
    }
    
    @Test
    public void buscarElfosPorStatusComDoisElfosVivos(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Josias");
        e.alistarElfo(ev);
        e.alistarElfo(en);
        assertEquals(2, e.buscar(Status.VIVO).size());
    }
}
