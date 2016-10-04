public class Item{
    //ATRIBUTOS
    private String descricao;
    private int quantidade;
    
    //CONSTRUTOR
    public Item(String descricao, int quantidade){
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    //METODOS
    public void aumentarUnidades(int unidades) {
        quantidade += unidades;
    }
    
    @Override
    public boolean equals(Object obj){
        Item item = (Item)obj;
        return item.descricao.equals(descricao) && item.quantidade == quantidade;
    }    
    
    //GETTERS AND SETTERS
    public void setQuantidade(int q){
        quantidade = q;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public String getDescricao(){
        return descricao;
    }
}