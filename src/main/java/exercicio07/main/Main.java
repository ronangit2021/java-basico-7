package exercicio07.main;

import java.util.Scanner;

public class Main {
	

public static void main(String[] args) {		
	
	Main app = new Main();
	 app.start();

}
private void start() {
	System.out.println("Digite 1 [soma] 2 [subtracao] e 3 [concatenar] [0] para sair");
	Scanner ler = new Scanner(System.in);
	int condicao = ler.nextInt();	
		
	while (condicao != 0) {
	
		switch (condicao){
		
		case 1:
			System.out.println("Metodo soma");
			soma(5,5);
			break;
			
		case 2:
			
			System.out.println("Metodo subtração");
			subtracao(10.27,10.42);
			break;
			
		case 3:
			
			System.out.println("Método concatenação");
			concat("44","Um texto qualquer");
			break;
			
		default:
			
			System.out.println("Este método não existe");
			break;
				
		}
		System.out.println("Digite 1 [soma] 2 [subtracao] e 3 [concatenar] [0] para sair");
		condicao = ler.nextInt();
		
		if ((condicao != 0) && (condicao != 1) && (condicao !=2) && (condicao != 3)  ) {
			System.out.println("Opção inválida");
			condicao = 0;
		}
	}	

	
}
	
	private void soma(int a, int b) {
		int res = a + b;
		 System.out.println("Resultado da operação:  "+ res);
	}
	
	private void subtracao(double a, double b) {
		double res = a - b;		
		System.out.println("Resultado da operação:  "+ res);
		
	}
	
	private void concat(String a, String b) {
		String res = a +" "+ b;
		System.out.println("Resultado da operação:  "+ res);
	}
	

}

