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
        String teste;

        //mensagens iniciais
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("nome??????????");
        nome = scan.next();//espera a resposta do usuario no console e armazena
        
        System.out.println("estado atual = "+state);
        
        //inicio
        Main hw = new Main();//necessario para usar as classes secundarias
        Inst inst1 = hw.new Inst();//
        inst1.clc();
        System.out.println("start\n");
        //loop principal
        while(loop==1){//loop do jogo
        	inst1.msg();
        	state = scan.nextInt();
        	System.out.println("estado atual: " + state);
        }
     }
     //classes secundarias
     public class Inst{//instruçoes
    	
    	public void msg(){
        	System.out.println("\n1.aaaaaaa\n2.bbbbbbbb\n3.ccccc\n");
    	}
    	public void clc(){//tentativa de apagar o console usando linha vazias
    		for(int i=0;i<15;i++){
    			System.out.print("\n");//\n pula uma linha e deve estar dentro da msg
    		}
    	}
     }
     public class Monst{//para criar e alterar monstros
         
         //variaveis do mosntro
         int st = 0;
         int lv = 1;
         int hp = 15;
         int exp = 0;
         int at = 5;
         int def = 5;
         int mag = 5;
         int spd = 5;
     }
     

}