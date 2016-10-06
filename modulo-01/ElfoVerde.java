import java.util.*;

public class ElfoVerde extends Elfo{
    public ElfoVerde(String n){
        super(n);
    }
    
    public ElfoVerde(String n, int quantidade){
        super(n, quantidade);
    }
    
    public void atirarFlechaEmDwarf(Dwarf anao){
        super.atirarFlechaEmDwarf(anao, 2);
    }
    
    @Override
    protected void inicializarInventario(int quantidadeFlechas) {
        this.adicionarItem(new Item("Arco de Vidro", 1));
        this.adicionarItem(new Item("Flecha de Vidro", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }
    
    public void adicionarItem(Item item){
        String[] validas = { 
            "Espada de aço valiriano", 
            "Arco de Vidro",
            "Flecha de Vidro"
        };
        boolean podeAdicionar = item != null && new ArrayList<>(Arrays.asList(validas)).contains(item.getDescricao());
        if(podeAdicionar){
            super.inventario.adicionarItem(item);
        }
    }
}
