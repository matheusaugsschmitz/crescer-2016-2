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
