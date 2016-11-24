/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crecer.aula1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.schmitz
 */
public class DateEx {
    /*Exibir na console a data atual do sistema.
    Informe a data de nascimento e devolva o dia da semana.*/
    public void DataAtual(){
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        Date dataAtual = new Date(System.currentTimeMillis());
        String dataAtualFormatada = dateformat.format(dataAtual);
        System.out.println(new StringBuffer("Data Atual: ").append(dataAtual));
        System.out.println(new StringBuffer("Data Atual Formatada: ").append(dataAtualFormatada));
    }
    
    
    public void DiaNascimento(String data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse(data);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataNascimento);
        ArrayList<String> diasDaSemana = new ArrayList<String>();
        JOptionPane.showMessageDialog(null, calendar.get(Calendar.DAY_OF_WEEK));
    }
}
