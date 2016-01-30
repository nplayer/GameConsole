package main;

import java.util.*;
//o ideal seria usar o console do pc e nao da ide
//mas temporariamente serve
//futuramente transformar num .jar(funciona como um executavel)
//Game classe principal
public class Main{

     public static void main(String []args){
        //variaveis do jogo
        int loop = 1;//mantem o loop principal do jogo
        int state = 0;//movimentaçao no cenario(zero seria o inicio)
        String nome;

        //mensagens iniciais
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("nome??????????");
        nome = scan.next();//espera a resposta do usuario no console e armazena
        
        System.out.println("seu nome = "+nome);
        
        //inicio
        Inst inst1 = new Inst();//
        inst1.clc();
        System.out.println("start\n");
        //loop principal
        while(loop==1){//loop do jogo
        	inst1.msg();
        	state = scan.nextInt();
        	System.out.println("estado atual: " + state);
        }
        
        // TESTE
        // TESTEEEEEEE
     }
}
