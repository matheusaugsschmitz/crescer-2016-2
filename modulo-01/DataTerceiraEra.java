public class DataTerceiraEra{
    //ATRIBUTOS
    private int dia, mes, ano;
    
    //CONSTRUTOR
    public DataTerceiraEra(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    //METODOS
    public boolean ehBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    //GETTERS
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
}
