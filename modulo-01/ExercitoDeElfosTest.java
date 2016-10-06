import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExercitoDeElfosTest{
    @After
    public void tearDown(){
        System.gc();//garbageCollector
    }
    
    @Test
    public void criarExercitoComElfoVerde(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo elfoVerde = new ElfoVerde("EV");
        e.alistarElfo(elfoVerde);
        assertEquals(elfoVerde, e.getElfosAlistados()[0]);
    }
    
    @Test
    public void criarExercitoComElfoNoturno(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo elfoNoturno = new ElfoNoturno("EN");
        e.alistarElfo(elfoNoturno);
        assertEquals(elfoNoturno, e.getElfosAlistados()[0]);
    }
    
    @Test
    public void criarExercitoComElfo(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo elfo = new Elfo("EN");
        e.alistarElfo(elfo);
        assertEquals(0, e.getElfosAlistados().length);
    }
    
    @Test
    public void criarExercitoCom1ElfoVerdeE1ElfoNoturno(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        e.alistarElfo(new ElfoVerde("Josias"));
        e.alistarElfo(new ElfoNoturno("Jonas"));
        assertEquals(2, e.getElfosAlistados().length);
    }
    
    @Test
    public void criarExercitoCom3ElfosNormais(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        e.alistarElfo(new Elfo("Josias"));
        e.alistarElfo(new Elfo("Jonas"));
        e.alistarElfo(new Elfo("Jonas"));
        assertEquals(0, e.getElfosAlistados().length);
    }
    
    @Test
    public void criarExercitoSemElfos(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        assertEquals(0, e.getElfosAlistados().length);
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
    public void buscarElfoPorNomeSemElfos(){
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
        ArrayList<Elfo> resultado = e.buscar(Status.VIVO);
        assertEquals(2, resultado.size());
    }
}
