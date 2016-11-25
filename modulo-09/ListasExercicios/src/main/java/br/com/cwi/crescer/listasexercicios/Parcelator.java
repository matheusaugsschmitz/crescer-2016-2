/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.listasexercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author matha
 */
public class Parcelator {
    public static void main(String[] args) throws ParseException{
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser parcelado!"));
        double taxaJuros = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de juros em %!"));
        int numeroParcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de parcelas!"));
        String stringData = JOptionPane.showInputDialog("Informe a data inicial no formato \"dd/mm/aaaa\"!");
        exibirDados(valor, taxaJuros, numeroParcelas, stringData);
    }
    public static void exibirDados(double valor, double taxaJuros, int numeroParcelas, String stringData) throws ParseException{
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = formatoData.parse(stringData);
        Calendar calendarInicial = Calendar.getInstance();
        calendarInicial.setTime(dataInicial);
        double valorParcela = (valor / numeroParcelas + valor) * (taxaJuros * 0.01);
        String quebraLinha = System.getProperty("line.separator");
        StringBuffer buffer = new StringBuffer("Valor: R$");
        buffer.append(valor).append(quebraLinha)
        .append(String.format("Juros: %s", taxaJuros)).append("%").append(quebraLinha)
        .append(String.format("Parcelas: %s", numeroParcelas)).append(quebraLinha);
        for(int i = 0; i < numeroParcelas; i++){
            buffer.append(String.format("%s - R$ %s", formatoData.format(calendarInicial.getTime()), valorParcela)).append(quebraLinha);
            calendarInicial.add(Calendar.MONTH, 1);
        }
        JOptionPane.showMessageDialog(null, buffer.toString());
    }
}
