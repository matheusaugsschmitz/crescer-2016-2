public class Dwarf{
    //ATRIBUTOS
    private int vida = 110;
    private DataTerceiraEra dataNascimento;
    private String nome;
    
    //CONSTRUTOR
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    //METODOS
    public void perderVida(){
        vida -= 10;
    }
    
    public double getNumeroSorte(){
        double numero = 101.0;
        if(dataNascimento.ehBissexto() && vida <= 90 && vida >= 80){
            numero = numero*(-33);
        }else{
            if(nome == "Seixas" || nome == "Meireles"){
                numero = (numero*33)%100;
            }
        }
        return numero;
    }
    
    //GETTERS AND SETTERS
    public int getVida(){
        return vida;
    }
    
    public String getNome(){
        return nome;
    }
    
    public DataTerceiraEra getDataNascimento(){
        return dataNascimento;
    }
}
