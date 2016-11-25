/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista1exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author matha
 */
public class MeuCalendarioUtil {
    public static void main(String[] args) throws ParseException{
        String quebraLinha = System.getProperty("line.separator");
        String opcao = JOptionPane.showInputDialog(new StringBuffer("Insira o número correspondente à opção que desejas:")
                .append(quebraLinha).append("1 - Retornar dia da semana da sua data de nascimento")
                .append(quebraLinha).append("2 - Retornar tempo decorrido até o presente").toString());
        String dataString = JOptionPane.showInputDialog("Informe a data no formato \"dd/mm/aaaa\"!");
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        String retorno;
        switch (Integer.parseInt(opcao)) {
            case 1:
                String dia = diaDaSemana(calendar);
                retorno = new StringBuffer("Você nasceu em um").append(dia.length() > 7 ? "a " : " ")
                                                               .append(dia)
                                                               .append(".").toString();
                break;
            case 2:
                retorno = new StringBuffer(tempoDecorrido(calendar)).toString();
                break;
            default:
                retorno = "Opção selecionada inválida";
        }
        JOptionPane.showMessageDialog(null, retorno);
    }
    public static String diaDaSemana(Calendar calendar){
        ArrayList<String> diasDaSemana = new ArrayList<String>();
        diasDaSemana.add("domingo");
        diasDaSemana.add("segunda-feira");
        diasDaSemana.add("terça-feira");
        diasDaSemana.add("quarta-feira");
        diasDaSemana.add("quinta-feira");
        diasDaSemana.add("sexta-feira");
        diasDaSemana.add("sábado");
        return diasDaSemana.get(calendar.get(Calendar.DAY_OF_WEEK)-1);
    }
    public static String tempoDecorrido(Calendar calendar){
        Calendar calendarAtual = Calendar.getInstance();
        calendarAtual.setTime(new Date(System.currentTimeMillis()));        
        Date dataAtual = new Date(System.currentTimeMillis());
        long diferencaAnos = calendarAtual.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
        long diferencaMeses = calendarAtual.get(Calendar.MONTH) - calendar.get(Calendar.MONTH);
        long diferencaDias = calendarAtual.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH);
        String retorno = String.format("%s ano%s, %s %s e %s dia%s.", diferencaAnos, 
                                                                      diferencaAnos > 1 ? "s" : "",
                                                                      diferencaMeses,
                                                                      diferencaMeses > 1 ? "meses" : "mês",
                                                                      diferencaDias,
                                                                      diferencaDias > 1 ? "s" : "");
        return retorno;
    }
}
