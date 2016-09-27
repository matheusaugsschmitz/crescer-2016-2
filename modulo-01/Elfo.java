public class Elfo{
    //Atributos
    private String nome;
    private Item arco;
    private Item flecha;
    private int exp;
    
    //Metodos
    public Elfo(String n){
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flecha", 42);
    }
    
    public void atirarFlecha(){
        flecha.setQuantidade(flecha.getQuantidade()-1);
        exp++;
    }
    
    /*public void atirarFlechaRefactory(){
        flecha.setQuantidade(flecha.getQuantidade()-1);
        exp++;
    }*/

    
    //Getters and Setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public Item getArco(){
        return arco;
    }
    
}