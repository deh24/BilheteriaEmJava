package view;

import Controller.ThreadPremioBilheteria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i = 1; i <= 300; i++){
			int qtComp = (int)((Math.random()* 4)+ 1);
			ThreadPremioBilheteria bilheteria= new ThreadPremioBilheteria(qtComp, i);
			bilheteria.start();
		}

	}

}
