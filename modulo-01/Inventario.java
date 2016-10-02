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
            Item itemAtual = itens.get(i);
            retorno += (i > 0 ? "," : "") + itemAtual.getDescricao();
        }
        return retorno;
    }
    
    public Item itemMaisPopular(){
        Item maiorQnt = new Item(null, 0);
        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getQuantidade() > maiorQnt.getQuantidade()){
                maiorQnt = itens.get(i);
            }
        }
        return maiorQnt;
    }
    
    public void ordenarItensAscendente(){
        ArrayList<Item> novaOrdem = new ArrayList<>(itens.size());
        for(int i = 0; i < itens.size(); i++){
            int indice = 0;
            int indiceAnterior = 0;
            if(i - 1 >= 0){ indiceAnterior = i - 1; }else{ indiceAnterior = 0; }
            for(int i1 = 0; i1 < itens.size(); i1++){
                if(itens.get(i1).getQuantidade() <= itens.get(indice).getQuantidade()){
                    if(!novaOrdem.isEmpty()){
                        if(itens.get(i1).getQuantidade() >= novaOrdem.get(indiceAnterior).getQuantidade() && !itens.get(i1).getDescricao().equals(novaOrdem.get(indiceAnterior).getDescricao())){
                            indice = i1;
                        }
                    }else{
                        indice = i1;
                    }
                }
            }
            novaOrdem.add(itens.get(indice));
        }
        itens = novaOrdem;
    }
    
    public void ordenarItens(TipoOrdenacao ordenacao){
        if(ordenacao == TipoOrdenacao.ASCENDENTE){
            ordenarItensAscendente();
        }else{
            ArrayList<Item> novaOrdem = new ArrayList<>(itens.size());
            ArrayList<Integer> indicesAsc = new ArrayList<>(itens.size());
            for(int i = 0; i < itens.size(); i++){
                int indice = 0;
                int indiceAnterior = 0;
                if(i - 1 >= 0){ indiceAnterior = i - 1; }else{ indiceAnterior = 0; }
                for(int i1 = 0; i1 < itens.size(); i1++){
                    if(itens.get(i1).getQuantidade() <= itens.get(indice).getQuantidade()){
                        if(!indicesAsc.isEmpty()){
                            if(itens.get(i1).getQuantidade() >= itens.get(indicesAsc.get(indiceAnterior)).getQuantidade() && !itens.get(i1).getDescricao().equals(itens.get(indicesAsc.get(indiceAnterior)).getDescricao())){
                                indice = i1;
                            }
                        }else{
                            indice = i1;
                        }
                    }
                }
                indicesAsc.add(indice);
            }
            for(int i = indicesAsc.size()-1; i >= 0; i--){
                novaOrdem.add(itens.get(indicesAsc.get(i)));
            }
            itens = novaOrdem; 
        }
    }
    
    public void aumentarUnidadesDosItens(int unidades){
        for (Item item : itens) {
            item.aumentarUnidades(unidades);
        }
    }
    
    public void aumentarSomatorialUnidadesDosItens(){
        for (Item item : itens) {
            int unidades = item.getQuantidade();
            if(unidades < 0){unidades *= -1;}
            for(int i = unidades-1; i > 0; i--){
                unidades += i;
            }    
            item.aumentarUnidades(unidades*1000);
        }
    }
    
    //GETTERS
    public ArrayList<Item> getItens(){
        return itens;
    }
}
