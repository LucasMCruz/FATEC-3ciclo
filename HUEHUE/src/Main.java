import java.util.Scanner;
//t6f3bx6
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos Kg de peixe voce pegou?");
		
		
		//EX4
		float kg = sc.nextInt();
		
		if(kg<=50) {
			System.out.println("Dentro do regulamento");
		}
		else {
			float pesoM = kg - 50;
			float pagoM = pesoM * 4;
			
			System.out.println("A quantidade de peixe que voce pegou foi de " + pesoM + "KG");
			System.out.println("O valor pago por essa quantidade vai ser de " + pagoM + "R$");
		}
		
		
		
		/*
		//Ex3
		String sexo = sc.nextLine();
		if (sexo.equals("M") || sexo.equals("m") || sexo.equals("F") || sexo.equals("f")) {
			
			System.out.println("Sexo valido");
		}
		else {
			System.out.println("Sexo invalido");
		}
		*/
		
		
		/*
		//EX2
		int num = sc.nextInt();
		if(num < 12) {
			float valor =  (float) 1.30;
			float total = valor * num;
			System.out.println("O total pago pelas as " + num + " maças é " + total + " R$");
		}
		else {
			int valor =  1;
			int total = valor * num;
			System.out.println("O total pago pelas as " + num + " maças é " + total + " R$");
			
		}
		*/
		
		
		/*
		//EX1
		float valorP = sc.nextInt();
		if(valorP<20) {
			float valorV = (float) (valorP * 1.45);
			System.out.println("O valor que o produto sera vendido vai ser de " + valorV + " R$");
		}
		else {
			float valorV = (float) (valorP* 1.30);
			System.out.println("O valor que o produto sera vendido vai ser de " + valorV + " R$");
		}
		*/
		
		/*int i = 0;
		while (i <100) {
			i += 1;
			System.out.println(i);
			
		}
		
		*/
		/*
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		*/
		

	}

}
