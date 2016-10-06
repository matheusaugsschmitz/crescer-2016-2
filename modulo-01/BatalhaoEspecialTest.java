
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste BatalhaoEspecialTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class BatalhaoEspecialTest{
    @After
    public void tearDown(){
        System.gc();//garbageCollector
    }
    
    @Test
    public void criarExercitoComElfoVerde(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        Elfo elfoVerde = new ElfoVerde("EV");
        e.alistarElfo(elfoVerde);
        assertEquals(elfoVerde, e.getElfosAlistados()[0]);
    }
    
    @Test
    public void criarExercitoComElfoNoturno(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        Elfo elfoNoturno = new ElfoNoturno("EN");
        e.alistarElfo(elfoNoturno);
        assertEquals(elfoNoturno, e.getElfosAlistados()[0]);
    }
    
    @Test
    public void criarExercitoComElfo(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        Elfo elfo = new Elfo("EN");
        e.alistarElfo(elfo);
        assertEquals(0, e.getElfosAlistados().length);
    }
    
    @Test
    public void criarExercitoCom1ElfoVerdeE1ElfoNoturno(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        e.alistarElfo(new ElfoVerde("Josias"));
        e.alistarElfo(new ElfoNoturno("Jonas"));
        assertEquals(2, e.getElfosAlistados().length);
    }
    
    @Test
    public void criarExercitoCom3ElfosNormais(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        e.alistarElfo(new Elfo("Josias"));
        e.alistarElfo(new Elfo("Jonas"));
        e.alistarElfo(new Elfo("Jonas"));
        assertEquals(0, e.getElfosAlistados().length);
    }
    
    @Test
    public void criarExercitoSemElfos(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        assertEquals(0, e.getElfosAlistados().length);
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosDiferentes(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        Elfo ev = new ElfoVerde("Josias");
        e.alistarElfo(ev);
        e.alistarElfo(new ElfoNoturno("Jonas"));
        assertEquals(ev, e.buscarPorNome("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosIguais(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Josias");
        e.alistarElfo(ev);
        e.alistarElfo(en);
        assertEquals(en, e.buscarPorNome("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeSemElfos(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        assertEquals(null, e.buscarPorNome("Josias"));
    }
    
    @Test
    public void buscarElfosPorStatusComDoisElfosVivos(){
        BatalhaoEspecial e = new BatalhaoEspecial();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Jonas");
        e.alistarElfo(ev);
        e.alistarElfo(en);
        HashMap<String, Elfo> resultado = e.buscar(Status.VIVO);
        assertEquals(2, resultado.size());
    }
}
