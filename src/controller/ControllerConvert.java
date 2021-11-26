package controller;

import model.PilhaInt;

public class ControllerConvert {

	public ControllerConvert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	PilhaInt pilha = new PilhaInt();
	
	 public int decToBin(int decimal) throws Exception {
	        
	        if(decimal == 0) {
	        	String bin = "";
	        	do {
	        		bin += pilha.top();
	        		pilha.pop();
	        	}while(pilha.size()>0);
	        	System.out.println(bin);
	            return 0;
	        }else {
	        	int aux = decimal%2;
		        pilha.push(aux);
		        decimal /=2;
	        }
	        return decToBin(decimal);
	    }
	
}