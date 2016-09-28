public class Elfo{
    //ATRIBUTOS
    private String nome;
    private Item arco;
    private Item flecha;
    private int exp;
    
    //CONSTRUTOR
    public Elfo(String n){
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flecha", 42);
    }
    
    //METODOS    
    public void atirarFlechaEmDwarf(Dwarf anao){
        if(flecha.getQuantidade() > 0){
            flecha.setQuantidade(flecha.getQuantidade()-1);
            exp++;
        }
        anao.perderVida();
    }
    
    /*public void atirarFlechaRefactory(){
        flecha.setQuantidade(flecha.getQuantidade()-1);
        exp++;
    }*/
    
    //GETTERS AND SETTERS
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public Item getArco(){
        return arco;
    }
    
    public Item getFlecha(){
        return flecha;
    }
    
    public int getExp(){
        return exp;
    }
}
