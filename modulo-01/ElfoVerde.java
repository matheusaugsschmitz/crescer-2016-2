
/**
 * Escreva a descrição da classe ElfosVerdes aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
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
    
    public void adicionarItem(Item item){
        if(item.getDescricao().equals("Espada de aço valiriano") || item.getDescricao().equals("Arco e Flecha de Vidro")){
            super.inventario.adicionarItem(item);
        }
    }
}
