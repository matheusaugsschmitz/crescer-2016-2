import java.util.ArrayList;
/**
 * Write a description of class Inventario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventario{
    //ATRIBUTOS
    private ArrayList<Item> itens = new ArrayList<>();
    
    //METODOS
    public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public void removerItem(Item item){
        for(int i = 0; i < itens.size(); i++){
            if(item.getDescricao().equals(itens.get(i).getDescricao()) && item.getQuantidade() == itens.get(i).getQuantidade()){
                itens.remove(i);
                break;
            }
        }
    }
    
    public String getDescricoesItens(){
        String retorno = "";
        for(int i = 0; i < itens.size(); i++){
            retorno += i > 0 ? "," + itens.get(i).getDescricao() : itens.get(i).getDescricao();
        }
        return retorno;
    }
    
    //GETTERS
    public ArrayList<Item> itens(){
        return itens;
    }
}
