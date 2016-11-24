package br.com.cwi.crecer.aula1;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.schmitz
 */
class StringRun {
    public static void main(String[] args) throws ParseException {
        /*if ("A".compareTo(new String("A")) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }*/
        //quantidadeDeVogais();
        //inverterValores();
        //System.out.println(Estados.getNome());
        DateEx teste = new DateEx();
        //teste.DataAtual();
        teste.DiaNascimento("30/08/2016");
    }
    /*
    Solicitar que o usuário informe um frase, e retorna a quantidade de vogais.*/
    public static void quantidadeDeVogais(){
        String frase = JOptionPane.showInputDialog("Informe uma frase!");
        String vogais = "aeiou";
        int quantidadeVogais = 0;
        for(int i = 0; i < frase.length(); i++){
            if(vogais.contains(frase.substring(i, i+1))){
                quantidadeVogais++;
            }
        }
        //frase.replaceAll("[aeiou]", ""); -> melhor
        StringBuilder resposta = new StringBuilder("A frase inserida possui ").append(quantidadeVogais).append(" vogais!");
        JOptionPane.showMessageDialog(null, resposta);
    }
    //Solicitar que o usuário informe valores e inverter string de entrada.
    public static void inverterValores(){
        String texto = JOptionPane.showInputDialog("Insira uma frase!");
        StringBuffer buffer = new StringBuffer(texto);
        buffer.reverse();       
        JOptionPane.showMessageDialog(null, buffer);
    }
}
