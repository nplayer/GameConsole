/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author tanaka
 */
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