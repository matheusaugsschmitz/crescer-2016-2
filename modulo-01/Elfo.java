import java.util.ArrayList;
public class Elfo extends Personagem{
    //ATRIBUTOS
    
    
    //CONSTRUTOR
    public Elfo(String n){
        //Chamando construtor de baixo
        this(n, 42);
    }
    
    public Elfo(String nome, int quantidade){
        super(nome);
        inventario.adicionarItem(new Item("Arco", 1));
        inventario.adicionarItem(new Item("Flecha", quantidade >= 0 ? quantidade : 42));
        vida = 100;
    }
    
    //METODOS   
    protected void inicializarInventario(int quantidadeFlechas) {
        this.inventario.adicionarItem(new Item("Arco", 1));
        this.inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }
     
    public void atirarFlechaEmDwarf(Dwarf anao){
        atirarFlechaEmDwarf(anao, 1);
    }
    
    //Com multiplicador de xp
    protected void atirarFlechaEmDwarf(Dwarf anao, int multiplicador){
        int quantidadeFlechas = getFlecha().getQuantidade();
        if(quantidadeFlechas > 0){
            getFlecha().setQuantidade(quantidadeFlechas-1);
            exp += multiplicador;
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
    
    public Item getArco(){
        return inventario.getItens().get(0);
    }
    
    public Item getFlecha(){
        return inventario.getItens().get(1);
    }
}
