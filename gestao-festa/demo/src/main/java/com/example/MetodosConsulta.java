package com.example;

import java.util.Scanner;

public class MetodosConsulta {
    private Scanner input=new Scanner(System.in);
    private String nome;
    private String idade;
    private int res;
    private String nameTable1;
    private int idTable;
    
    public void inicializar(){
        do{
            System.out.println("insira a operação desejada: ");
            
        }while(true);
    }

    public String inserir(){
        System.out.println("cadastro homem insira seus dados abaixo");
        System.out.println("nome: ");
        nome=input.nextLine();
        System.out.println("idade: ");
        idade=input.nextLine();
        return "insert into homem values('"+nome+"','"+idade+"')";
    }
    public String atualizar(){
        System.out.println("deseja alterar nome idade ou os dois?");
        System.out.println("1-nome");
        System.out.println("2-idade");
        System.out.println("3-os dois");
        res=input.nextInt();
        input.nextLine();
        if(res==1){
            System.out.println("nome que deseja inserir: ");
            nameTable1=input.nextLine();
            System.out.println("id na tabela: ");
            idTable=input.nextInt();
            return "update homem set nome= '"+nameTable1+"' where id= "+idTable+"";
        }else{
            return "";
        }
        
    }

}
