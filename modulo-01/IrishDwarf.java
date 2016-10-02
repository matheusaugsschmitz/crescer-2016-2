import java.util.ArrayList;
/**
 * Write a description of class IrishDwarf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IrishDwarf extends Dwarf{
    public IrishDwarf(String nome, DataTerceiraEra dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
    }  
    
    public IrishDwarf(){
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    public void tentarSorte(){
        if(getNumeroSorte() == -3333.0){
            inventario.aumentarSomatorialUnidadesDosItens();
        }
    }
}
