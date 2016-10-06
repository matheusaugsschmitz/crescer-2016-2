public class ElfoNoturno extends Elfo{
    public ElfoNoturno(String nome){
        super(nome);
    }
    
    public ElfoNoturno(String n, int quantidade){
        super(n, quantidade);
    }
    
    public void atirarFlechaEmDwarf(Dwarf anao){
        if (status == Status.VIVO && getFlecha().getQuantidade() > 0) {
            super.atirarFlechaEmDwarf(anao, 3);
            this.vida *= 0.95;
            this.status = (int)this.vida == 0 ? Status.MORTO : this.status;
        }
    }
    //5.2
    //Os Elfos Noturnos não podem morrer, pois a vida será reduzida de maneira exponencial sem chegar ao valor 0, no caso, para morrer, ao invés de reduzir 5%, deveria reduzir 100% da vida
}
