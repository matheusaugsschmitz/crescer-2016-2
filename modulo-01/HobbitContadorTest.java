
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HobbitContadorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HobbitContadorTest{
    
    @Test
    public void calcularDiferencaCom3ParesDeNumeros(){
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        ArrayList<Integer> quinzeE18 = new ArrayList<>();
        ArrayList<Integer> quatroE5 = new ArrayList<>();
        ArrayList<Integer> dozeE60 = new ArrayList<>();
        quinzeE18.add(15);
        quinzeE18.add(18);
        quatroE5.add(4);
        quatroE5.add(5);
        dozeE60.add(12);
        dozeE60.add(60);
        arrayDePares.add(quinzeE18);
        arrayDePares.add(quatroE5);
        arrayDePares.add(dozeE60);
        HobbitContador contador = new HobbitContador();
        int diferenca = contador.calcularDiferenca(arrayDePares);
        assertEquals(840, diferenca);
    }
    
    @Test
    public void calcularDiferencaCom6ParesDeNumeros(){
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        ArrayList<Integer> quinzeE18 = new ArrayList<>();
        ArrayList<Integer> quatroE5 = new ArrayList<>();
        ArrayList<Integer> dozeE60 = new ArrayList<>();
        ArrayList<Integer> seteE20 = new ArrayList<>();
        ArrayList<Integer> onzeE9 = new ArrayList<>();
        ArrayList<Integer> onzeE7 = new ArrayList<>();
        quinzeE18.add(15);
        quinzeE18.add(18);
        quatroE5.add(4);
        quatroE5.add(5);
        dozeE60.add(12);
        dozeE60.add(60);
        seteE20.add(7);
        seteE20.add(20);
        onzeE9.add(11);
        onzeE9.add(9);
        onzeE7.add(11);
        onzeE7.add(7);
        arrayDePares.add(quinzeE18);
        arrayDePares.add(quatroE5);
        arrayDePares.add(dozeE60);
        arrayDePares.add(seteE20);
        arrayDePares.add(onzeE9);
        arrayDePares.add(onzeE7);
        HobbitContador contador = new HobbitContador();
        int diferenca = contador.calcularDiferenca(arrayDePares);
        assertEquals(840, diferenca);
    }

}
