public class Item{
    //variaveis
    private String descricao;
    private int quantidade;
    
    //Metodos
    public Item(String descricao, int quantidade){
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    //Getters and Setters
    public void setQuantidade(int q){
        quantidade = q;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
}