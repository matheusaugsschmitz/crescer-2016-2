/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista2exercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matha
 */
public class MeuSQLUtils {
    public static void main(String[] args) {
        try ( final Scanner scanner = new Scanner(System.in) ) {
            System.out.println("Insira o caminho de um arquivo sql!");
            String linhaComando = scanner.nextLine();
            MeuSQLUtils sqlUtils = new MeuSQLUtils();
            sqlUtils.importarCSV(linhaComando);            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler/executar o comando!");
            System.out.println(e);
        }
    }
    public void leSQL(String arquivo){
        if(arquivo.contains(".sql")){
            try (   
                final Reader reader = new FileReader(arquivo);
                final BufferedReader bufferReader = new BufferedReader(reader);
            ) {
                bufferReader.lines().forEach((linha) -> this.executaComandoSQL(linha.replaceAll(";", "")));
                //bufferReader.lines().forEach(System.out::println);
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não incontrado!");
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Arquivo solicitado incompatível!");
        }
    }
    private void executaComandoSQL(String comando){
        try (
                final Connection connection = MeuConnectionUtils.getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement(comando)
            ) {
            preparedStatement.executeUpdate();
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }
    public List<String> executaConsultaSQL(String comando){
        List<String> linhas = new ArrayList<>();
        try (
                final Connection connection = MeuConnectionUtils.getConnection();
                final Statement statement = connection.createStatement();
                final ResultSet resultSet = statement.executeQuery(comando);
            ) {
            String linhaAtual = "";
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                linhaAtual += resultSet.getMetaData().getColumnName(i) + "\t \t";
            }
            linhas.add(linhaAtual);
            while (resultSet.next()) {
                linhaAtual = "";
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    linhaAtual += resultSet.getString(i) + "\t \t";
                }
                linhas.add(linhaAtual);
            }
            return linhas;
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
        return null;
    }
    public void importarCSV(String arquivo){
        List linhas;
        String sql = "insert into %s (%s) values (%s)";
        if(arquivo.contains(".csv")){
            try (   
                final Reader reader = new FileReader(arquivo);
                final BufferedReader bufferReader = new BufferedReader(reader);
            ) {
                StringBuilder campos = new StringBuilder();
                linhas = Arrays.asList(bufferReader.lines().toArray());
                Arrays.asList(linhas.get(1).toString().split(";")).forEach((campo) -> campos.append(campo).append(", "));
                campos.deleteCharAt(campos.toString().trim().length() - 1);
                sql = String.format(sql, linhas.get(0).toString().split(";")[1], campos.toString(), "%s");
                for (int i = 2; i < linhas.size(); i++) {
                    this.executaComandoSQL(String.format(sql, "\'".concat(linhas.get(i).toString().replaceAll(";", "\', \'")).concat("\'")));
                }
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não incontrado!");
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Arquivo solicitado incompatível!");
        }
    }
    public void exportarCSV(String arquivo, String consulta){
        List<String> linhas = new ArrayList<>();
        String[] palavras = consulta.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            if(palavras[i].equalsIgnoreCase("from")){
                linhas.add("table_name;".concat(palavras[i+1]));
            }
        }
        List<String> retornoConsulta = this.executaConsultaSQL(consulta);
        for (String string : retornoConsulta) {
            StringBuilder builder = new StringBuilder(string.replaceAll("\t \t", ";"));
            builder.deleteCharAt(builder.length()-1);
            linhas.add(builder.toString());
        }
        new MeuWriterUtils().escreverConteudo(arquivo, linhas);
    }
}

