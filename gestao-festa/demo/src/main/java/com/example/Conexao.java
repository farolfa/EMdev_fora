package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
    public void conectar(){
        MetodosConsulta metodosConsulta=new MetodosConsulta();
        String url="jdbc:sqlserver://serverraul.database.windows.net:1434;databaseName=BancoEstudos;encrypt=false";
        String user="sqladmin";
        String password="Sfat@2027";
        String crie="create table homem(nome varchar(50) not null,idade int not null)";
        String mostra="select * from homem";
        int resUser;
       try (Connection conn = DriverManager.getConnection(url,user,password); ){
        Statement stmt=conn.createStatement();
        System.out.println("conectado");   
        //int laelecode=stmt.executeUpdate(crie);
        System.out.println("insira a operação que deseja fazer: ");

        int laelecode2=stmt.executeUpdate(metodosConsulta.inserir());
        // System.out.println("colocou");
        ResultSet rs=stmt.executeQuery(mostra);
        int x=1;
        while (rs.next()) { 
            System.out.println("id: "+x);
            String nome=rs.getString("nome");
            int idade=rs.getInt("idade");
            System.out.println("nome: "+nome+"\nidade: "+idade);
            System.out.println("=====================");
            x++;
        }
    
       } catch (Exception e) {
        e.printStackTrace();
       }
        
    }
}