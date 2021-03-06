/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.listasexercicios;

import java.text.Normalizer;
import javax.swing.JOptionPane;

/**
 *
 * @author matha
 */
public class MeuStringUtil {
    public static void main(String[] args){
        String quebraLinha = System.getProperty("line.separator");
        String opcao = JOptionPane.showInputDialog(new StringBuffer("Insira o número correspondente ao que desejas aplicar à string:")
                .append(quebraLinha).append("1 - Verificar se é vazia")
                .append(quebraLinha).append("2 - Retornar número de vogais")
                .append(quebraLinha).append("3 - Inverter")
                .append(quebraLinha).append("4 - Identificar se é um palíndromo").toString());
        String texto = JOptionPane.showInputDialog("Informe a string!");
        String retorno;
        MeuStringUtil stringUtil = new MeuStringUtil();
        switch (Integer.parseInt(opcao)) {
            case 1:
                retorno = new StringBuffer("A string informada ").append(stringUtil.ehVazia(texto) ? "" : "não ")
                                                                 .append("é vazia.").toString();
                break;
            case 2:
                retorno = new StringBuffer("String possui ").append(stringUtil.numeroDeVogais(texto))
                                                            .append(" vogais.").toString();
                break;
            case 3:
                retorno = new StringBuffer("String invertida: ").append(stringUtil.inverteString(texto)).toString();
                break;
            case 4:
                retorno = new StringBuffer("A string informada ").append(stringUtil.identificarPalindromo(texto) ? "" : "não ")
                                                                 .append("é um pálindromo.").toString();
                break;
            default:
                retorno = "Opção selecionada inválida";
        }
        JOptionPane.showMessageDialog(null, retorno);
    }
    public boolean ehVazia(String string){
        return !string.isEmpty();
    }
    public int numeroDeVogais(String string){
        return string.toLowerCase().replaceAll("[^a^e^i^o^u]", "").length();
    }
    public String inverteString(String string){
        return new StringBuilder(string).reverse().toString();
    }
    public boolean identificarPalindromo(String string){
        String frasePura = normalize(string.toLowerCase().replaceAll(" ", ""));
        return inverteString(frasePura).equals(frasePura);
    }
    private String normalize(String string) {
        return Normalizer.normalize(string, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
