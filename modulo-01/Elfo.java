import java.util.ArrayList;
public class Elfo{
    //ATRIBUTOS
    private String nome;
    private int exp;
    private Status status;
    private Inventario inventario;
    
    
    //CONSTRUTOR
    public Elfo(String n){
        //Chamando construtor de baixo
        this(n, 42);
    }
    
    public Elfo(String n, int q){
        nome = n;
        inventario = new Inventario();
        inventario.adicionarItem(new Item("Arco", 1));
        inventario.adicionarItem(new Item("Flecha", q >= 0 ? q : 42));
        status = Status.VIVO;
    }
    
    //METODOS    
    public void atirarFlechaEmDwarf(Dwarf anao){
        ArrayList<Item> itens = inventario.getItens();
        if(itens.get(1).getQuantidade() > 0){
            itens.get(1).setQuantidade(itens.get(1).getQuantidade()-1);
            exp++;
        }
        anao.perderVida();
    }
    
    public String toString(){
        boolean flechaNoSingular = inventario.getItens().get(1).getQuantidade() == 1;
        boolean nivelUm = exp == 1 || exp == 0;
        return String.format("%s possui %d flecha%s e %d níve%s de experiência.", nome, inventario.getItens().get(1).getQuantidade(), flechaNoSingular ? "" : "s", exp, nivelUm ? "l" : "is");
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
        return inventario.getItens().get(0);
    }
    
    public Item getFlecha(){
        return inventario.getItens().get(1);
    }
    
    public int getExp(){
        return exp;
    }
    
    public Status getStatus(){
        return status;
    }
}
