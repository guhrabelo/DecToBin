package view;

import java.util.Scanner;

import controller.ControllerConvert;

public class Principal {
	public static void main(String[] args) throws Exception {
		ControllerConvert convert = new ControllerConvert();
		Scanner read = new Scanner(System.in);
		
		int num;
		
		System.out.println("Escreva o numero para ser convertido: ");
		num = read.nextInt();
		
		num = convert.decToBin(num);
	}
}
