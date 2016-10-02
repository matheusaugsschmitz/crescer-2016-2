import java.util.ArrayList;
/**
 * Write a description of class HobbitContador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HobbitContador{
    private ArrayList<ArrayList<Integer>> pares;
    public int calcularDiferenca(ArrayList<ArrayList<Integer>> pares){
        this.pares = pares;
        ArrayList<Integer> produtos = calcularProdutos();
        ArrayList<Integer> mmc = calcularImc();
        int somaDiferenca = 0;
        for(int i = 0; i < pares.size(); i++){
            somaDiferenca += produtos.get(i) - mmc.get(i);
        }
        return somaDiferenca;
    }    
    
    public ArrayList<Integer> calcularProdutos(){
        ArrayList<Integer> produtos = new ArrayList<>();
        for(int i = 0; i < pares.size(); i++){
            produtos.add(pares.get(i).get(0) * pares.get(i).get(1));
        }
        return produtos;
    }
    
    public ArrayList<Integer> calcularImc(){
        ArrayList<Integer> mmcs = new ArrayList<>();
        for(int i = 0; i < pares.size(); i++){
            int mmc = 1;
            while(mmc % pares.get(i).get(0) != 0 || mmc % pares.get(i).get(1) != 0){
                mmc++;
            }
            mmcs.add(mmc);
        }
        return mmcs;
    }
}