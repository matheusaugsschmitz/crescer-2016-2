public class Elfo{
    //Atributos
    private String nome;
    private Item arco;
    private Item flecha;
    private int exp;
    
    //Metodos
    public Elfo(String n, int flechas){
        if(flechas == 0){
            flechas = 42;
        }
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flecha", flechas);
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
}
