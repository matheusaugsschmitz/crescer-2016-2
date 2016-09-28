public class Elfo{
    //ATRIBUTOS
    private String nome;
    private Item arco;
    private Item flecha;
    private int exp;
    
    //CONSTRUTOR
    public Elfo(String n){
        //Chamando construtor de baixo
        this(n, 42);
    }
    
    public Elfo(String n, int q){
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flecha", q);
    }
    
    //METODOS    
    public void atirarFlechaEmDwarf(Dwarf anao){
        if(flecha.getQuantidade() > 0){
            flecha.setQuantidade(flecha.getQuantidade()-1);
            exp++;
        }
        anao.perderVida();
    }
    
    public String toString(){
        boolean flechaNoSingular = flecha.getQuantidade() == 1;
        boolean nivelUm = exp == 1 || exp == 0;
        return String.format("%s possui %d flecha%s e %d níve%s de experiência.", nome, flecha.getQuantidade(), flechaNoSingular ? "" : "s", exp, nivelUm ? "l" : "is");
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
